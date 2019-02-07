import java.util.*;

public class luckoftheroll {
    public static final int LOSEAT = 22;
    public static void main(String[] args){

        //set up scanner and random objects
        Scanner input = new Scanner(System.in);
        Random rng = new Random();

        //declare vars to be used
        boolean gameNotWon;
        int numberOfGames;
        int rollNumber;
        int player1;
        int player2;
        boolean player1Lost;
        boolean player2Lost;
        boolean tie;
        int winnerNumber;
        int player1Wins=0;
        int player2Wins=0;
        int tieCount=0;

        //get number of games to be played
        System.out.print("How many games do you want to play? ");   
        numberOfGames = input.nextInt();
        
        //main loop to run x amount of games
        for(int i=1;i<=numberOfGames;i++){
            
            //reset vars after 1 game
            gameNotWon = true;
            winnerNumber=-1;
            rollNumber=0;
            player1=0; 
            player2=0; 
            player1Lost=false;
            player2Lost=false;
            tie=false;

            System.out.println("*** GAME "+i+" ***");
            System.out.println("Roll Player 1 Player 2");
            while(gameNotWon){
                player1+=rng.nextInt(6)+1;
                player2+=rng.nextInt(6)+1;
                System.out.println(""+rollNumber+"\t"+player1+"\t"+player2);
                rollNumber += 1; 
                if(player2 > 21) player2Lost=true;
                if(player1 > 21) player1Lost=true; 
                if(player1Lost && player2Lost) tie=true;
                if(tie || player1Lost || player2Lost) gameNotWon=false; 
                }
            
            if(tie) {
                System.out.println("It's a tie!\n");
                tieCount+=1;    
            }
            else if(player1Lost){
                System.out.println("Player two wins!\n");
                player2Wins+=1;
            }
            else {
                System.out.println("Player one wins!\n");
                player1Wins+=1; 
            }
        }
        System.out.println("*** GAME SUMMARY ***\nPlayer 1 Player 2 Ties\n"+player1Wins+"\t   "+player2Wins+"\t   "+tieCount);
    }
}
