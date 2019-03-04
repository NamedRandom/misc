import java.util.Scanner;

public class project2_2 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int max=0,min=1,sum=0,counter=0,temp;

        while(true){
            
            System.out.print("Enter number, -1 to quit: ");
            temp = input.nextInt();
            sum+=temp;
            if(temp==-1) break;
            if(temp<min) min = temp;
            if(temp>max) max = temp;
            counter++;
        }

        System.out.println("Max was: "+max);
        System.out.println("Min was: "+min);
        System.out.println("Average: "+(sum/(double)counter));
    }
}
