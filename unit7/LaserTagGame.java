import java.util.*;

public class LaserTagGame {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many players? ");
        int playerCount = input.nextInt();
        ArrayList<LaserTagPlayer> players = new ArrayList<LaserTagPlayer>(); 
        for(int i=0;i<playerCount;i++){
            System.out.print("Enter player "+(i+1)+"'s name: ");
            String name = input.next();
            players.add(new LaserTagPlayer(name));
        }
    int round = 1;
	while(players.size()>1){
		System.out.println("\n###############Round "+round+"###############");
		 syncLives(players);
         for(LaserTagPlayer p: players)
             System.out.println(p);
         if(players.size()>1) for(LaserTagPlayer p:players) shoot(p,players);
        round++;
	}
    if(players.size()==1) System.out.println("\n\nCongrats! "+players.get(0).getName()+" wins!");
    else System.out.println("It's a draw!");
    }
    public static void syncLives(ArrayList<LaserTagPlayer> players){
        ArrayList<LaserTagPlayer> toRemove = new ArrayList<LaserTagPlayer>();
        
        for(int i=0;i<players.size();i++)
            if(players.get(i).getShieldStrength()<=0) toRemove.add(players.get(i));
            
        players.removeAll(toRemove);
        
    }
    public static void shoot(LaserTagPlayer p,ArrayList<LaserTagPlayer> arr){
        Random rng = new Random();
        int target = rng.nextInt(arr.size());
        while(p==arr.get(target)) if(p==arr.get(target)||arr.get(target)==null) target = rng.nextInt(arr.size());
        arr.get(target).setShieldStrength(arr.get(target).getShieldStrength()-p.getLaserPower());
    }
}
