import java.util.*;

public class votingMachine{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int tom=0,jerry=0,invalid=0;
        String temp="";
        while(!temp.equalsIgnoreCase("done")){
            System.out.print("Enter vote: ");
            temp=input.next();
            if(temp.equalsIgnoreCase("tom")) tom++;
            else if(temp.equalsIgnoreCase("jerry")) jerry++;
            else invalid++;
        }
        invalid--;
        int total=tom+jerry+invalid;
        System.out.println("Number of voters: "+total+"\n"+invalid+" invalid votes, "+((double)invalid*100/total)+"%\n"+tom+" votes for tom ("+((double)tom*100/total)+"%)\n"+jerry+" votes for jerry ("+(100*jerry/(double)total)+")");
        if(tom>jerry) System.out.println("Tom wins by "+(tom-jerry)+" votes");
        else if(jerry>tom) System.out.println("Jerry wins by "+(jerry-tom)+" votes");
        else System.out.println("There was a draw.");
    }
}
