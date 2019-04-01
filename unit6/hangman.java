import java.util.*;

public class hangman {
    
    public static final String HANGMANWORD = "mathspace";

    public static void main(String[] args){
        
        String[] wordArr = stringToArr(HANGMANWORD);
        String[] outputArr = new String[HANGMANWORD.length()];
        Arrays.fill(outputArr,"_ ");
        Scanner input = new Scanner(System.in);
        String letterIn = "";
        boolean notGuessed=true;

        print(outputArr);
        while(notGuessed){
        
            System.out.print("Guess a letter: ");
            letterIn = input.nextLine();
            checkIfTrue(wordArr,outputArr,letterIn);
            if(Arrays.deepEquals(outputArr,wordArr)) notGuessed = false;
            print(outputArr);
        }

    }


    public static void print(String[] printMeArr){
        for(String i:printMeArr) System.out.print(i);
        System.out.print("\n\n");
    }
    
    public static void checkIfTrue(String[] wordArr,String[] output,String letterIn){

        for(int i=0;i<wordArr.length;i++){
            if(wordArr[i].toUpperCase().equals(letterIn.toUpperCase())) output[i] = letterIn.toUpperCase()+" ";
        }
        

    }

    public static String[] stringToArr(String input){
        String[] output = new String[input.length()];
        for(int i=0;i<input.length();i++)
            output[i]=String.valueOf(input.charAt(i)).toUpperCase();
        return output;
    }
}
