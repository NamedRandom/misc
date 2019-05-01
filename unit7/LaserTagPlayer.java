import java.util.Random;
public class LaserTagPlayer {
    
    Random rng = new Random();

    private String name;
    private int laserPower;
    private int shieldStrength;

    public LaserTagPlayer(String n,int l,int s){
        name=n;
        laserPower=l;
        shieldStrength=s;
    }
    public LaserTagPlayer(String n){
        name=n;
        laserPower=rng.nextInt(10)+1;
        shieldStrength=100;
    }
    public boolean isShieldDepleted(){
        if(shieldStrength<=0) return true;
        return false;
    }
    public String toString(){
        return name+", laser @ "+laserPower+" and shield @ "+shieldStrength;
    }
    public void attemptToTag(LaserTagPlayer enemy){
        if(rng.nextInt(2)==1){
        enemy.setShieldStrength(enemy.getShieldStrength()-this.laserPower);
        System.out.println("Hit!");
        }
        else System.out.println("Miss!");
    }


    //mutators and accessors
    public void setName(String n){
        name=n;
    }
    public void setLaserPower(int l){
        laserPower=l;
    }
    public void setShieldStrength(int s){
        shieldStrength=s;
    }
    public String getName(){
        return name;
    }
    public int getLaserPower(){
        return laserPower;
    }
    public int getShieldStrength(){
        return shieldStrength;
    }
}
