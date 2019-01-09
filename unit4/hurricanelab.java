
import java.util.Scanner;
public class hurricanelab {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int wind;
    System.out.print("Enter your wind speed: ");
    wind  = input.nextInt();
    classifyHurricane(wind);
  }
  public static void classifyHurricane(int wind){
    if(wind>253) System.out.println("Cat 5: World Record Wind Speed!");
    else if(wind>=155) System.out.println("Cat 5: Complete roof failure on many residences and industrial buildings. Massive evacuation required.");
    else if(wind>=131) System.out.println("Cat 4: Major erosion of beach areas, major damage to lower floors of structres near the shore.");
    else if(wind>=111) System.out.println("Cat 3: Structural damage, mobile homes destroyed, flooding near coastline.");
    else if(wind>=94) System.out.println("Cat 2: Damage to roofind materials, windows, and doors.");
    else if(wind>=74) System.out.println("Cat 1: Damage primarily to unanchored mobile homes, shurbbery, and trees.");
    else System.out.println("Minimal or no damage.");
  }

}
