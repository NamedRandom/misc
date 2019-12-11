import java.util.*;

public class yahtzee {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] roll = new int[5];
        int score = 0;
        int i=0;

        while(i<roll.length){
            
            diceRoll(roll);
            System.out.println("Your roll: "+Arrays.toString(roll));
            
            i++;

        }

    }
    
    public static void diceRoll(int[] arr){
        Random rng = new Random();
        for(int i=0;i<arr.length;i++)
            arr[i]=rng.nextInt(6)+1;
    }

    public static int getPoints(int[] rolls, int index) {
        if (index < 6) {
            int count = 0;
            for (int i = 0; i < rolls.length; i++) {
                if (rolls[i] == index + 1) count++;
            }
            return count * (index + 1);
        }
        else if (index == 11) {
            int match = rolls[0];
            for (int i = 1; i < rolls.length; i++) {
                if (rolls[i] != match) return 0;
            }
            return 50;
        }
        else if (index == 12) {
            int sum = 0;
            for (int i = 0; i < rolls.length; i++) {
                sum += rolls[i];
            }
            return sum;
        }
        else if (index == 9 || index == 10) {
            boolean[] has = new boolean[6];
            for (int i = 0; i < rolls.length; i++) {
                has[rolls[i] - 1] = true;
            }
            if (index == 10) {
                if (has[1] && has[2] && has[3] && has[4] && (has[0] || has[5])) {
                    return 40;
                }
                else {
                    return 0;
                }
            }
            if (has[2] && has[3] && ((has[0] && has[1]) || 
                                     (has[1] && has[4]) ||
                                     (has[4] && has[5]))) {
                return 30;
            }
            else {
                return 0;
            }
        }
        else {
            int[] counts = new int[6];
            for (int i = 0; i < rolls.length; i++) {
                counts[rolls[i] - 1]++;
            }
            if (index == 6 || index == 7) {
                for (int i = 0; i < counts.length; i++) {
                    if (counts[i] >= index - 3) return getPoints(rolls, 12);
                }
                return 0;
            }
            else {
                if (getPoints(rolls, 11) == 50) return 25;
                
                boolean found3 = false;
                boolean found2 = false;
                for (int i = 0; i < counts.length; i++) {
                    if (counts[i] == 3) found3 = true;
                    if (counts[i] == 2) found2 = true;
                }
                if (found2 && found3) return 25;
                else return 0;
                
            }
        }   
    }
}
