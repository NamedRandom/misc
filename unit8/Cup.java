public class Cup{
    private double capacity;
    private double currentVolume;
    public Cup(double c){
        capacity=c;
        currentVolume=0;
    }
    public void fillWith(Drink drink){
        if((capacity-currentVolume)>=drink.getOunces()){
            currentVolume+=drink.getOunces();
            drink.setOunces(0);
        }
        else {
            double roomInCup=(capacity-currentVolume);
            currentVolume=capacity;
            drink.setOunces(drink.getOunces()-roomInCup);
        }
    }
    public String toString(){
        return "A "+capacity+" oz cup currently filled with "+currentVolume+"oz";
    }
}
