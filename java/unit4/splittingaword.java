import java.util.Scanner;
public class splittingaword {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter word:");
    printLetters(scanner.nextLine().replaceAll(" ","").trim());
  }
  public static void printLetters(String input){
    for(int i=0;i<input.length()-1;i++) System.out.print(input.charAt(i)+", ");
    System.out.print(input.charAt(input.length()-1)+"\n");
  }
}
