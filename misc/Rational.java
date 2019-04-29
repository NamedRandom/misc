public class Rational 
{
    private int num;
    private int denum;

    public Rational(int n,int d){
        num = n;
        denum = d;
		while(getGCD(num,denum)!=1)
        	simplify();
    }
    public Rational(){
        this(0,1);
    }
    public String toString(){
        return ""+num+"/"+denum;
    }
    private void simplify(){
		int gcd=getGCD(num,denum);
		num/=gcd;
		denum/=gcd;
    }
    private static int getGCD(int x,int y){
		if (y == 0) return x;
    	return getGCD(y, x % y);
    }
    public double getValue(){
        return num/denum;
    }
}
