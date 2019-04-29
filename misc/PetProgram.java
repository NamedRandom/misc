import java.util.Scanner;
public class PetProgram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Pet[] pets = new Pet[5];
        
        for(int i=0;i<pets.length;i++){
            System.out.print("Name of pet "+i);
            String name = input.next();
            System.out.print("Age of pet "+i+" (years)");
            int age = input.nextInt();
            System.out.print("Weight of pet "+i+" (pounds)");
            double weight = input.nextDouble();

            pets[i] = new Pet(name,age,weight); 
        }
        String[] names = findValues(pets);
        double[] averages = average(pets);

        String smallestName = names[0];
        String largestName = names[1];
        String oldestName = names[2];
        String youngestName = names[3];
        double averageWeight = averages[0]; 
        double averageAge = averages[1];

        System.out.println("Name of smallest pet: "+smallestName+"\nName of largest pet: "+largestName+"\nName of oldest pet: "+oldestName+"\nName of youngest pet: "+youngestName+"\nAverage weight: "+averageWeight+"\nAverage age: "+averageAge);

    }
    public static double[] average(Pet[] arr){
        double[] output = new double[2];
        for(Pet p:arr){
            output[0]+=p.getWeight();    
            output[1]+=p.getAge();
        }
        output[0]/=arr.length;
        output[1]/=arr.length;
        return output;
    }
    public static String[] findValues(Pet[] arr){
        
        double smallest=arr[0].getWeight();
        double largest=arr[0].getWeight();
        int oldest=arr[0].getAge();
        int youngest=arr[0].getAge();

        String[] output= new String[4];
        
        //main loop to find values
        for(Pet p : arr){
            //find smallest
            if(p.getWeight()<smallest){
                output[0] = p.getName();
                smallest = p.getWeight();
            }
            //find largest
            if(p.getWeight()<largest){
                output[1] = p.getName();
                largest = p.getWeight();
            }
            //find oldest
            if(p.getAge()<oldest){
                output[2] = p.getName();
                oldest = p.getAge();
            }
            //find youngest
            if(p.getAge()<youngest){
                output[3] = p.getName();
                youngest = p.getAge();
            }
        }
        return output;
    }
}
