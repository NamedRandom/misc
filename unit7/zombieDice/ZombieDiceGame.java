import java.util.*;

public class ZombieDiceGame{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many players? ");
        int playerCount = input.nextInt();
        ArrayList<ZombieDicePlayer> players = new ArrayList<ZombieDicePlayer>();
        for(int i=0;i<playerCount;i++){
            System.out.print("Enter player "+(i+1)+"'s name: ");
            players.add(new ZombieDicePlayer(input.next()));
        }
        System.out.println(players.toString()); //debug line if needed
        boolean gameWon = false;
        boolean tie=false;
        ArrayList<ZombieDicePlayer> winners=null;
        int rounds=1;
        while(!gameWon){

            System.out.println("Round "+rounds);
            for(ZombieDicePlayer p:winners)
                p.playRound();

            winners = winCheck(players);
            if(winners.size()==1) gameWon=true;
            else {gameWon=true;tie=true;}
            rounds++;
        }

        if(!tie) System.out.println(winners.get(0).getName()+" is the winner!");
        else {
            System.out.print("Tie between ");
            for(ZombieDicePlayer p:winners)
                System.out.print(p.getName()+" ");
        }
        

    }
    public static ArrayList<ZombieDicePlayer> winCheck(ArrayList<ZombieDicePlayer> arr){
        ArrayList<ZombieDicePlayer> winners = new ArrayList<ZombieDicePlayer>();
        for(ZombieDicePlayer p : arr)
            if(p.getBrains()==13) winners.add(p);
        return winners;
    }
}
