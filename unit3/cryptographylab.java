//mert albayrak cryptography lab
import java.util.Scanner;
public class cryptographylab{
  public static void main(String[] args) {
    Scanner heyImAScanner = new Scanner(System.in);
    System.out.print("Enter five words: ");
    String inputString = heyImAScanner.nextLine();
    String firstWordOfS=wordOfString(inputString,1);
    System.out.println(firstWordOfS);
    String secondWordOfS=wordOfString(inputString,2);
    System.out.println(secondWordOfS);
    String thirdWordOfS=wordOfString(inputString,3);
    System.out.println(thirdWordOfS);
    String fourthWordOfS=wordOfString(inputString,4);
    System.out.println(fourthWordOfS);
    String fifthWordOfS=wordOfString(inputString,5);
    System.out.println(fifthWordOfS);
    System.out.println(firstWordOfS+" "+secondWordOfS+" "+thirdWordOfS+" "+fourthWordOfS+" "+fifthWordOfS);

  }
  public static String wordOfString(String stringIn,int wordOfString){
    for (int i=1;i<wordOfString;i++){
      stringIn=(stringIn.substring(stringIn.indexOf(' ')+1,stringIn.length()));
    }
    boolean isDoesContainsWhiteSpace=stringIn.contains(" ");
    for(;isDoesContainsWhiteSpace==false;)
      return stringIn;
    return (stringIn.substring(0,stringIn.indexOf(' ')));
  }
}
