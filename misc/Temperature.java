public class Temperature{
    
    private double temp;
    private char scale;
    
    public Temperature(){
        this(0,'C');
    }
    public Temperature(double t,char s){
        if(s=='C'||s=='c') scale = s;
        else if(s=='F' || s=='f') scale = s;
        else System.out.println("You must enter either C or F");
        temp = t;
    }
    public Temperature(double t){
        this();
        temp = t;
    }
    public Temperature(char s){
        this();
        if(s=='C'||s=='c') scale = s;
        else if(s=='F' || s=='f') scale = s;
        else System.out.println("You must enter either C or F");
    }
    public double getFahrenheit(){
        if(scale=='F') return temp;
        else return (Math.round((9*temp/5.0+32)*10))/10.0;
    }
    public double getCelsius(){
        if(scale=='C') return temp;
        else return (Math.round((5*(temp-32)/9.0)*10))/10.0;
    }
    public void setTemp(double t){
        temp=t;
    }
    public void setScale(char s){
        if(s=='C'||s=='c') scale = s;
        else if(s=='F' || s=='f') scale = s;
        else System.out.println("You must enter either C or F");
    }
    public void setBoth(double t,char s){
        temp = t;
        scale = s;
    }
    public boolean equals(Temperature t){
        if(this.getCelsius() == t.getCelsius()) return true;
        return false;
    }
    public boolean isGreaterThan(Temperature t){
        if(this.getCelsius() > t.getCelsius()) return true;
        return false;
    }
    public boolean isLessThan(Temperature t){
        if(this.getCelsius() < t.getCelsius()) return true;
        return false;
    }
    public String toString(){
        return ""+temp+scale;
    }
    public double getAccurateCelsius(){
        if(scale=='C') return temp;
        return (9*(temp/5.0)+32);
    }
}
