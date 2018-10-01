//Mert Albayrak SpaceWeight Lab 10-1-18
import java.util.Scanner;
public class SpaceWeight {
  public static void main(String[] args) {
    double earth=1.0;
    double moon=0.167;
    double venus=0.887;
    double mars=0.378;
    double mercury=0.370;
    double jupiter=2.312;
    double saturn=0.896;
    double uranus=0.869;
    double neptune=1.100;
    double pluto=0.060;
    Scanner input=new Scanner (System.in);
    System.out.println("Weight On Earth:");
    double earthWeight=input.nextDouble();
    System.out.println();
    System.out.println("Location\tMass\tGravity\tWeight");
    System.out.println();
    System.out.println("Earth\t\t"+earthWeight+"\t"+earth+"\t"+(earthWeight*earth));
    System.out.println("Earth's Moon\t"+earthWeight+"\t"+moon+"\t"+(earthWeight*moon));
    System.out.println("Venus\t\t"+earthWeight+"\t"+venus+"\t"+(earthWeight*venus));
    System.out.println("Mars\t\t"+earthWeight+"\t"+mars+"\t"+(earthWeight*mars));
    System.out.println("Mercury\t\t"+earthWeight+"\t"+mercury+"\t"+(earthWeight*mercury));
    System.out.println("Jupiter\t\t"+earthWeight+"\t"+jupiter+"\t"+(earthWeight*jupiter));
    System.out.println("Saturn\t\t"+earthWeight+"\t"+saturn+"\t"+(earthWeight*saturn));
    System.out.println("Uranus\t\t"+earthWeight+"\t"+uranus+"\t"+(earthWeight*uranus));
    System.out.println("Neptune\t\t"+earthWeight+"\t"+neptune+"\t"+(earthWeight*neptune));
    System.out.println("Pluto\t\t"+earthWeight+"\t"+pluto+"\t"+(earthWeight*pluto));
  }
}
