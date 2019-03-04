import java.util.Scanner;

public class project2_1{
 
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int heads=0;
        int tails=0;
        System.out.print("First toss: ");
        if(input.next().charAt(0)=='h') heads++;
        else tails++;
        System.out.print("Second toss: ");
        if(input.next().charAt(0)=='h') heads++;
        else tails++;
        System.out.print("Third toss: ");
        if(input.next().charAt(0)=='h') heads++;
        else tails++;
        System.out.print("Fourth toss: ");
        if(input.next().charAt(0)=='h') heads++;
        else tails++;
        System.out.print("Fifth toss: ");
        if(input.next().charAt(0)=='h') heads++;
        else tails++;
        System.out.print("Sixth toss: ");
        if(input.next().charAt(0)=='h') heads++;
        else tails++;
        System.out.print("Seventh toss: ");
        if(input.next().charAt(0)=='h') heads++;
        else tails++;
        System.out.print("Eighth toss: ");
        if(input.next().charAt(0)=='h') heads++;
        else tails++;

        System.out.println("Number of heads: "+heads);
        System.out.println("Number of tails: "+tails);
        System.out.println("Percent of heads: "+(heads/(double)(heads+tails)*100));
        System.out.println("Percent of tails: "+(tails/(double)(heads+tails)*100));



    }

}
