public class Drink{
    private String type;
    private double ounces;

    public Drink(String type,double ounces){
        this.type=type;
        if(ounces>=0) this.ounces=ounces;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setOunces(double ounces){
        if(ounces>=0) this.ounces=ounces;
    }
    public String getType(){
        return type;
    }
    public double getOunces(){
        return ounces;
    }
}
