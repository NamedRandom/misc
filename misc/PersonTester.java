public class PersonTester{
    public static void main(String[] args){
        Person p1 = new Person("Joe",19);
        Person p2 = new Person("Susan", 22);
        Person p3 = new Person("Joe", 30);
        Person p4 = new Person("Bill",24);
        
        System.out.println("Person "+p1.getName()+", Aged "+p1.getAge());
        System.out.println("Person "+p2.getName()+", Aged "+p2.getAge());
        System.out.println("Person "+p3.getName()+", Aged "+p3.getAge());
        System.out.println("Person "+p4.getName()+", Aged "+p4.getAge());

        //set p4 name to Joe, test if equal to p1
        p4.setName("Joe");
        p4.setAge(19);
        System.out.println("\nSet p4 name to "+p4.getName()+", and age to "+p4.getAge());

        System.out.println("\nDoes p1 equal p4? "+p1.equals(p4));

        //test if p2 equals p3
        System.out.println("Does p2 equal p3? "+p2.equals(p3));
        
        //test if p1 and p3 have same name
        System.out.println("\nDo p1 and p3 have the same name? "+p1.nameEquals(p3));
        //test if p2 and p4 have same name
        System.out.println("Do p2 and p4 have the same name? "+p2.nameEquals(p4));

        //test if p1 and p4 have the same age
        System.out.println("\nDo p1 and p4 have the same age? "+p1.ageEquals(p4));
        //test if p2 and p4 have the same age
        System.out.println("Do p2 and p4 have the same age? "+p2.ageEquals(p4));

        //test if p3 is older than p1 
        System.out.println("\nIs p3 older than p1? "+p3.isOlderThan(p1));
        //test if p2 is older than p3 
        System.out.println("Is p2 older than p3? "+p2.isOlderThan(p3));

        //test if p1 is younger than p3 
        System.out.println("\nIs p3 younger than p1? "+p1.isYoungerThan(p3));
        //test if p3 is older than p2 
        System.out.println("Is p2 younger than p3? "+p3.isYoungerThan(p2));

    }
}
