import java.util.*;

public class rps {
    public static void main(String[] args){
        
        //scanner and random objects
        Scanner input = new Scanner(System.in);
        Random rng = new Random();

        //var setup
        String username;
        int playerA=0;
        int playerB=0;
        int tie=0;

        //start here
        for(int i=0;i<100000000;i++){
            System.out.println(i);
            int first=rng.nextInt(3); //0 is rock 1 is scissors 2 is paper
            int second=rng.nextInt(3);
            if(first==0&&second==1){
                System.out.println("Rock beat Scissors");
                playerA++;
            }
            if(first==2&&second==0){
                System.out.println("Paper beat Rock");
                playerA++;
            }
            if(first==1&&second==2){
                System.out.println("Scissors beat Paper");
                playerA++;
            }
            if(first==1&&second==0){
                System.out.println("Rock beat Scissors");
                playerB++;
            }
            if(first==0&&second==2){
                System.out.println("Paper beat Rock");
                playerB++;
            }
            if(first==2&&second==1){
                System.out.println("Scissors beat Paper");
                playerB++;
            }
            if(first==second){
                System.out.println("Draw!");
                tie++;
            }

        }
            System.out.println("Player A won "+playerA+" times, player B won "+playerB+" times, "+tie+" draws");

        
    }
}

