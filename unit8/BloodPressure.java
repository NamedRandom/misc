import java.util.Scanner;

public class BloodPressure{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String name;
        int lower,upper;

        for(int i=0;i<8;i++){
            System.out.print("Patient's name? ");
            name = input.next();
            System.out.print("Systolic? ");
            upper = input.nextInt();
            System.out.print("Diastolic? ");
            lower = input.nextInt();

            System.out.println("\n"+name+" has "+category(lower,upper));
        }
    }
    public static String category(int lower,int upper){
        if(upper>=160||lower>=100) return "high blood pressure, stage 2";
        if(upper>=140||lower>=90) return "high blood pressure, stage 1";
        if(upper>=120||lower>=80) return "prehypertension";
        return "normal blood pressure";
    }
}
