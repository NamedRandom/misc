//Mert Albayrak Madlibs 10-01-18
import java.util.Scanner;
public class Madlibs {
  public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    System.out.print("Name:");
    String name=input.nextLine();
    System.out.print("Noun:");
    String noun=input.nextLine();
    System.out.print("Different Noun:");
    String noun2=input.nextLine();
    System.out.print("Plural Noun:");
    String noun3=input.nextLine();
    System.out.print("Color:");
    String color=input.nextLine();
    System.out.print("Flavor:");
    String flavor=input.nextLine();
    System.out.print("Holiday:");
    String holiday=input.nextLine();
    System.out.print("Amount of Money (Just a number):");
    String money=input.nextLine();
    System.out.print("Adjective:");
    String adjective=input.nextLine();
    System.out.println();
    System.out.println("Dear "+name+",\nThanks for placing your chocolate order with the "+color+" "+noun2+" Chocolate Company.\nUnfortunately, your "+flavor+" flavored chocolates are unavailable right now because "+adjective+" "+noun+" "+noun2+" "+noun3+"\naccidentally fell in our chocolate vat.  We’re sorry for any inconvenience this caused.\nSince you were ordering these for a party to celebrate "+holiday+", we would like to offer you "+noun+" shaped truffles at a discount of $"+money+" instead.\nSincerely,\n\nMert");
  }
}
