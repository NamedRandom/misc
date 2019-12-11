import java.util.Scanner;

public class day1{
    public static void main(String[] args){
        System.out.println("     __//\ncf  /.__.\\\n    \\ \\/ /\n \'__/\t \\\n  \\-\t  )\n   \\_____/\n_____|_|____\n     \" \"");

        Scanner input = new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.print("Enter your minutes: ");
            int mins = input.nextInt();
            getTime(mins);
        }
    }
    public static void getTime(int minutes){
        System.out.println(minutes+" minutes is "+minutes/60+" hours and "+minutes%60+" minutes");
    }
}
