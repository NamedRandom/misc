import java.util.*;

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
    int round = 1;
	while(!gameWon){
        
        playGame(players,gameTracker,round);
        gameWon=winCheck(gameTracker);
        round++;
	}
    
    System.out.println("Congrats! "+players[0]+" wins!");
    
    }
    public static void playGame(LaserTagPlayer[] players, boolean[] tracker,int round){

        System.out.println("Round "+round);
        
        for(LaserTagPlayer p: players){
            System.out.println(p);
        }
        for(LaserTagPlayer p:players) 
            shoot(p,players);
        
        syncLives(players,tracker);

    }
    public static void syncLives(LaserTagPlayer[] p,boolean[] t){
        for(int i=0;i<p.length;i++)
            if(p[i].getShieldStrength()<=0) t[i]=false;
        
        p=shrinkArray(p);
        t=shrinkArray(t);

    }
    public static void shoot(LaserTagPlayer p,LaserTagPlayer[] arr){
        Random rng = new Random();

        int target = rng.nextInt(arr.length);
        while(p==arr[target])
            if(p==arr[target]) target = rng.nextInt(arr.length);
        arr[target].setShieldStrength(arr[target].getShieldStrength()-p.getLaserPower());


    }
    public static int indexOf(LaserTagPlayer p,LaserTagPlayer[] arr){
        int output=-1;
        for(int i=0;i<arr.length;i++)
            if(p==arr[i]) output = i;
        return output;
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
   public static LaserTagPlayer[] shrinkArray(LaserTagPlayer[] arr){
       /*if(arr.length==1){
           System.out.println("STOP 1");
           LaserTagPlayer[] arrOut = new LaserTagPlayer[1];
           arrOut[0]=arr[0];
           return arrOut;
       }*/
       int counter=0;
           System.out.println("STOP 2");
       for(LaserTagPlayer p:arr)
           if(p.getShieldStrength()>0) counter++;
       LaserTagPlayer[] arrOut = new LaserTagPlayer[counter];
       counter=0;
           System.out.println("STOP 3");
       for(LaserTagPlayer p:arr){

           System.out.println("STOP 4");
           arrOut[counter]=p;
           counter++;
       }
       return arrOut;
   }
}
