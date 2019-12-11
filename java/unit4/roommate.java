import java.util.Scanner;
public class roommate {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    String yes="yes";
    String no="no";
    System.out.println("I will tell you what kind of roommate you are.\n\nDo you have a job? ");
    if((input.nextLine().toLowerCase()).equals(yes)) {
      System.out.println("Are you in a relationship? ");
      if((input.nextLine().toLowerCase()).equals(yes)) {
        System.out.println("Does your bf/gf have a roommate?");
        if((input.nextLine().toLowerCase()).equals(yes)) {
          System.out.println("You are: the Lover");
          return;
        }
        System.out.println("You are: the Ghost");
        return;
      }
      System.out.println("Oh geez, did you get dumped again?");
      if((input.nextLine().toLowerCase()).equals(yes)) {
        System.out.println("You are: the Derelict");
        return;
      }
      System.out.println("You are: the Night Owl");
      return;
    }
    System.out.println("Do your parents love you? ");
    if((input.nextLine().toLowerCase()).equals(yes)) {
      System.out.println("You are: the Prodigal Son");
      return;
    }
    System.out.println("You are: the Freeloader");
  }
}
