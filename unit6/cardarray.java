import java.util.Random;

public class cardarray {

    public static String[] ranks = new String[] {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
    public static String[] suits = new String[] {"Diamonds","Hearts","Spades","Clubs"};

    public static void main(String[] args){
        String[] cardNames = getCardArray(ranks,suits);
        System.out.println("All 52 cards: "+plsPrintArray(cardNames)+"\n\n");
        System.out.println("A poker hand: "+drawCards(cardNames,5)+"\n\n");
        System.out.println(war(cardNames));
    }
    public static String plsPrintArray(String[] input){
        String output="";
        for(String i : input){
            output+=i+", ";
        }
        return output.substring(0,output.length()-2);
    }

    public static String drawCards(String[] input,int cardAmount){
        int temp;
        String output = "";
        Random rng = new Random();
        for(int i=0;i<cardAmount;i++)
        output+=input[rng.nextInt(52)]+", ";
        return output.substring(0,output.length()-2);
    }

    public static String war(String[] input){
        String output = drawCards(input,2);
        String firstCard = output.substring(0,output.indexOf(","));
        String secondCard = output.substring(output.indexOf(",")+2,output.length());
        int firstCardNumber = findIndexOfArray(input, firstCard);
        int secondCardNumber = findIndexOfArray(input, secondCard);
        String winningCard;
        if(firstCardNumber%13>secondCardNumber%13) winningCard = firstCard+" is greater!"; 
        else if(firstCardNumber%13<secondCardNumber%13) winningCard = secondCard+" is greater!";
        else winningCard = "they are both equal!";
        return ("You drew "+firstCard+" and "+secondCard+" and "+winningCard);
    }
    
    public static int findIndexOfArray(String[] inputArray, String findMe){
        for (int i=0;i<inputArray.length;i++) {
            if(inputArray[i].equals(findMe)){
                return i;
            }
        }
        return -1;
    }
    public static String[] getCardArray(String[] ranks,String[] suits){
        int index=0;
        String[] output = new String[52];
        for(String suit: suits){
            for(String rank: ranks){
                output[index]=rank+" of "+suit;
                index++;
            }
        }
        return output;
    }
}
