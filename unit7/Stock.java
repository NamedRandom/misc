public class Stock {
    
    private String tickerSymbol;
    private String name;
    private double price;
    private double oldPrice;

    public Stock(String t,String n,double p){
        price = p;
        tickerSymbol = t;
        name = n;
    }
    public String toString(){
        return tickerSymbol+" ("+name+"): $"+price+" ("+getUpDown()+" "+getPercent()+"%)";
    }
    public double getPercent(){
        return (oldPrice-price)/price*100;
    }
    public String getUpDown(){
        if(price>oldPrice) return "up";
        else return "down";
    }
    public void setTickerSymbol(String t){
        tickerSymbol = t;
    }
    public void setName(String n){
        name = n;
    }
    public void setPrice(double p){
        oldPrice = price;
        price = p;
    }
    public String getTickerSymbol(){
        return tickerSymbol;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}
