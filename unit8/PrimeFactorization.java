import java.util.*;

public class PrimeFactorization{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        ArrayList<Integer> factors = getFactors(number);
        if(factors.size()==2){  //check if prime before generating list of prime numbers to save time
            System.out.println("Already prime!");
            return;
        }
        ArrayList<Integer> primes = getPrimeList(number); //list of prime numbers lesser than number
        primes.retainAll(factors); //primes becomes arraylist of prime factors
        ArrayList<Integer> counters = new ArrayList<Integer>();
        while(counters.size()<primes.size()) counters.add(0); //fill counters with however many 0's needed because you can't do operations otherwise
        for(int i:primes)
            while(number%i==0){
                counters.set(primes.indexOf(i), counters.get(primes.indexOf(i)) + 1); //try to divide by each factor and count if successful
                number/=i;
            }
        String output="";
        for(int i:primes){
            if(counters.get(primes.indexOf(i))==1) output+="*"+i;
            else if(counters.get(primes.indexOf(i))>1) output+="*"+i+"^"+counters.get(primes.indexOf(i)); 
        }
        output=output.substring(1,output.length()); //remove extra leading *
        System.out.println(output);
    }
    public static ArrayList<Integer> getFactors(int number){
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for(int i=1;i<number;i++)
            if(number%i==0) factors.add(i);
        factors.add(number);
        return factors;
    }
    public static ArrayList<Integer> getPrimeList(int limit){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int i=2;i<limit;i++){
            primes.add(i);
        }
        Integer temp = Integer.valueOf(0); //needed because ArrayList is of type 'Integer', not 'int'
        int k;
        for(int i=0;i<primes.size();i++){
            k = primes.get(i);
            for(int j=0;k*(k+j)<limit;j++){
                temp = k*(k+j);
                primes.remove(temp);
            }
        }
        return primes;
    }
}
