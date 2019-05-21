public class VendingMachine{
    public static void main(String[] args){
        Drink coke16oz = new Drink("coke",16.907);
        Drink coke12 = new Drink("coke",12);
        Cup cup24 = new Cup(24);


        cup24.fillWith(coke16oz);
        System.out.println(cup24);
        System.out.println(coke16oz);
        cup24.fillWith(coke12);
        System.out.println(cup24);
        System.out.println(coke12);

    }
}
