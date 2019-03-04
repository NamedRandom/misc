import java.util.Scanner;

public class project2_3 {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int temp,counter=0,A=0,B=0,C=0,D=0,F=0;

        while(true){
            
            temp = input.nextInt();
            if(temp==-1) break;
            counter++;
            if(temp>=90) A++;
            else if(temp>=80) B++;
            else if(temp>=70) C++;
            else if(temp>=60) D++;
            else F++;

        }

        System.out.println("Total number of grades = "+counter);
        System.out.println("Number of A's: "+A);
        System.out.println("Number of B's: "+B);
        System.out.println("Number of C's: "+C);
        System.out.println("Number of D's: "+D);
        System.out.println("Number of F's: "+F);
    }

}
