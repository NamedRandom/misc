import java.util.*;
public class stdDev {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers? ");
        double[] numbers = new double[input.nextInt()]; 
        //for(int i:numbers)
        //    numbers[i]=input.nextInt();
        for(int i=0;i<numbers.length;i++){
            System.out.print("Enter a number: ");
            numbers[i]=input.nextInt();
        }
        System.out.println("Mean: "+mean(numbers));
        System.out.println("Squares: "+Arrays.toString(squares(numbers)));
        System.out.println("Variance: "+mean(squares(numbers)));
        System.out.println("Standard Deviation: "+standDev(numbers));
    }
    public static double mean(double[] input){
        double output = 0;
        for(double i:input)
            output+=i;
        return output/input.length;
    }
    public static double[] squares(double[] input){
        double[] output = new double[input.length];
        for(int i=0;i<input.length;i++){
            output[i] = (input[i]-mean(input))*(input[i]-mean(input));
        }
        return output;
    }
    public static double standDev(double[] input){
    return Math.sqrt(mean(squares(input)));
    }
}
