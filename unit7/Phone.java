import java.util.Random;

public class Phone {
    private int batteryCharge;

    public int getCharge(){
        return batteryCharge;
    }
    public Phone(int c){
        if(c>100) c=100;
        else if(c<0) c=0;
        batteryCharge=c;
    }
    public Phone(){
      batteryCharge=0;
    }
    public String toString(){
        return "A phone charged at "+batteryCharge+"%\n";
    }
    public void die(){
        batteryCharge=0;
        System.out.println("The phone needs to be charged.");
    }
    public void checkEmail(){
        if(batteryCharge>0){
            batteryCharge--;
            System.out.println("No new messages");
        }
        if(batteryCharge==0) die();
    }
    public void charge(int chargeTime){
        if(chargeTime <= 0) return;
        System.out.println("Charging...");
                while(batteryCharge<100 && batteryCharge<batteryCharge+chargeTime){
            batteryCharge++;
        }
    }
    public void playGame(){
        if(batteryCharge>=1 && batteryCharge <=9) System.out.println("Not enough battery to play game");
        if(batteryCharge == 0) die();
        else {
            System.out.println("Playing game...");
            Random rng = new Random();
            if(rng.nextInt(2)==0) System.out.println("You lost!\n");
            else System.out.println("You won!\n");
            batteryCharge-=10;
        }
    }
}
