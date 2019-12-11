import java.util.Scanner;
public class sentinel {
    public static final int NOVAR=0;
    public static final int YESVAR=1;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        int counter = 10;
        while(counter != 0){
            System.out.print("Are you bored yet? [Press 1 for Yes, 0 for No]: ");
            int answer = input.nextInt();
            if(answer == YESVAR) {
                System.out.println("Finally!");
                return;
            }
            if(answer == NOVAR) {
                if(counter != 1)System.out.println("Hmm..");
                counter -= 1;
            }
        }
        System.out.println("I give up.");
    }
}
