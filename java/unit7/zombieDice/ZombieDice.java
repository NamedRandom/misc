import java.util.Random;

public class ZombieDice {
    private int brains;
    private int shotguns;
    private int runners;

    public ZombieDice(String color){
        if(color.toLowerCase().equals("green")){
            brains=3;
            shotguns=1;
            runners=2;
        }
        else if(color.toLowerCase().equals("red")){
             brains=1;
             shotguns=3;
             runners=2;
         }
		else if(color.toLowerCase().equals("yellow")){
             brains=2;
             shotguns=2;
             runners=2;
         } 
    }
    public int[] roll(){
        Random rng = new Random();
        int side = rng.nextInt(3);
        if(side == 0) return new int[]{0,brains};
        if(side == 1) return new int[]{1,shotguns};
        if(side == 2) return new int[]{2,runners};

        return null;
    }
}
