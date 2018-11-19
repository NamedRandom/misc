//mert albayrak cryptography lab
import java.util.Scanner;
public class cryptographylab{
  public static void main(String[] args) {
    Scanner heyImAScanner = new Scanner(System.in);
    System.out.print("Enter five words: ");
    String inputString = heyImAScanner.nextLine();
    System.out.print("Enter five integers: ");
    String inputIntegers = heyImAScanner.nextLine();
    String firstWordOfS=wordOfString(inputString,1);
    String secondWordOfS=wordOfString(inputString,2);
    String thirdWordOfS=wordOfString(inputString,3);
    String fourthWordOfS=wordOfString(inputString,4);
    String fifthWordOfS=wordOfString(inputString,5);
    System.out.print(firstWordOfS.charAt(Integer.parseInt(wordOfString(inputIntegers,1))));
    System.out.print(secondWordOfS.charAt(Integer.parseInt(wordOfString(inputIntegers,2))));
    System.out.print(thirdWordOfS.charAt(Integer.parseInt(wordOfString(inputIntegers,3))));
    System.out.print(fourthWordOfS.charAt(Integer.parseInt(wordOfString(inputIntegers,4))));
    System.out.print(fifthWordOfS.charAt(Integer.parseInt(wordOfString(inputIntegers,5))));
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
