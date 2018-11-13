//mert albayrak StringsLab 11-13-18
import java.util.Scanner;
public class StringsLab{
  public static void main(String[] args) {
    Scanner heyAScanner = new Scanner(System.in);
    System.out.print("Enter a phrase: ");
    String stringIn = heyAScanner.nextLine();
    System.out.println("You typed:"+stringIn);
    System.out.println("**!!**| "+stringIn+" |**!!**");
    System.out.println("Your string is "+stringIn.length()+"characters long.");
    System.out.println("The first character: "+stringIn.charAt(0));
    System.out.println("The last character: "+stringIn.charAt(stringIn.length()-1));
    System.out.println("All uppercase: "+stringIn.toUpperCase());
    System.out.println("All lowercase: "+stringIn.toLowerCase());
    System.out.print("What character would you like to replace? ");
    String replaceThis = heyAScanner.nextLine();
    System.out.print("What character would you like to replace "+replaceThis+" with? ");
    String replaceItWithMe = heyAScanner.nextLine();
    System.out.println("Replacing all "+replaceThis+"'s with "+replaceItWithMe+"'s...");
    System.out.println(stringIn.replace(replaceThis,replaceItWithMe));
    }
}
