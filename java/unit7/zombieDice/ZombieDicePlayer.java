import java.util.*;

public class ZombieDicePlayer{
    private String name;
    private int brains;

    public ZombieDicePlayer(String n){
        name = n;
        brains = 0;
    }
	public int getBrains(){
        return brains;
	}
	public String getName(){
        return name;
	}
    public void playRound(){
        ZombieDice[] dice = drawDice();
        int[] rolls = rollDice(dice);
        
        if(rolls[1]>=3){
            System.out.println(name+" lost their turn!");
            brains=0;
        } 
        else brains+=rolls[0];

    }
    private int[] rollDice(ZombieDice[] arr){
        int[] output = new int[2]; //0 == brains 1 == shotguns runners are re-rolled if brains < 6
        int[] temp = new int[3]; //0 == brains 1 == shotguns 2 == runners
        ArrayList<ZombieDice> tempDice = new ArrayList<ZombieDice>();
        for(ZombieDice d:arr){
            int[] roll = d.roll();
            temp[roll[0]]+=roll[1];  
            if(roll[0]==2) tempDice.add(d); 
        }
        int[] roll = null;
        if(temp[2]>0&&brains<6){
            for(ZombieDice d : tempDice)
                roll = d.roll();
                temp[roll[0]]+=roll[1];  
        }
        return output;
    }
	private ZombieDice[] drawDice(){
        Random rng = new Random();
        ZombieDice[] arr = new ZombieDice[3];
        for(int i=0;i<arr.length;i++){
            int roll = rng.nextInt(3);
            if(roll==0) arr[i] = new ZombieDice("green");
            if(roll==1) arr[i] = new ZombieDice("red");
            if(roll==2) arr[i] = new ZombieDice("yellow");
         }
         return arr;
    }

}
