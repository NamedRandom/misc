import java.util.Scanner;
import java.util.Arrays;

public class LaserTagGame {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("How many players?");
        int playerCount = input.nextInt();
        LaserTagPlayer[] players = new LaserTagPlayer[playerCount];
        for(int i=0;i<players.length;i++){
            System.out.print("Enter player "+(i+1)+"'s name: ");
            String name = input.next();
            players[i] = new LaserTagPlayer(name);
        }
        boolean[] gameTracker = new boolean[players.length];
        Arrays.fill(gameTracker,true);
	boolean gameWon=false;
	while(!gameWon){
        
        playGame(players,gameTracker);
        gameWon=winCheck(gameTracker);

	}
    
    System.out.println("Congrats! "+players[0]+" wins!");
    
    }
    public static void playGame(LaserTagPlayer[] players, boolean[] tracker){

    }
    public static boolean winCheck(boolean[] tracker){
        if(tracker.length==1) return true;
        shrinkArray(tracker);
        return false;
    }
    public static boolean[] shrinkArray(boolean[] arr){
        int counter=0;
        for(boolean b:arr)
            if(b) counter++;
        boolean[] arrOut = new boolean[counter];
        Arrays.fill(arrOut,true);
        return arrOut;
    }
}
