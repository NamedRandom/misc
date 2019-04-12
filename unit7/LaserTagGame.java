import java.util.Scanner;

public class LaserTagGame {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("How many players?");
        int playerCount = input.nextInt();
        LaserTagPlayer[] players = new LaserTagPlayer[playerCount];
        for(int i=0;i<players.length;i++){
            System.out.print("Enter player "+(i+1)+"'s name: ");
            String name = input.nextLine();
            players[i] = new LaserTagPlayer(name);
        }

    }
}
