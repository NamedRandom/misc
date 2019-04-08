public class UsePurchase {
    public static void main(String[] args){
        Purchase oranges = new Purchase();
        Purchase eggs = new Purchase();
        Purchase apples = new Purchase();
        Purchase watermelons = new Purchase();
        Purchase bagels = new Purchase();

        oranges.setName("Oranges");
        oranges.setPrice(10,2.99);
        oranges.setNumberBought(24);

        eggs.setName("Eggs");
        eggs.setPrice(12,1.69);
        eggs.setNumberBought(36);

        apples.setName("Apples");
        apples.setPrice(3,1.00);
        apples.setNumberBought(20);

        watermelons.setName("Watermelons");
        watermelons.setPrice(1,4.39);
        watermelons.setNumberBought(2);

        bagels.setName("Bagels");
        bagels.setPrice(6,3.50);
        bagels.setNumberBought(12);

        System.out.println(""+oranges.getNumberBought()+" oranges: $"+oranges.getTotalCost());
        System.out.println(""+eggs.getNumberBought()+" eggs: $"+eggs.getTotalCost());
        System.out.println(""+apples.getNumberBought()+" apples: $"+apples.getTotalCost());
        System.out.println(""+watermelons.getNumberBought()+" watermelons: $"+watermelons.getTotalCost());
        System.out.println(""+bagels.getNumberBought()+" bagels: $"+bagels.getTotalCost());

        System.out.println("\n Total Cost: $"+(oranges.getTotalCost()+eggs.getTotalCost()+apples.getTotalCost()+watermelons.getTotalCost()+bagels.getTotalCost()));
    }
}
