public class ComplexNumber{
    private int a;
    private int b;
    
    public ComplexNumber(int real, int imaginary){
        a=real;
        b=imaginary;
    }
    public int getReal(){
        return a;
    }
    public int getImaginary(){
        return b;
    }
    public ComplexNumber(){
        this(0,1);
    }
    public String toString(){
        if(a==0&&b==0) return ""+0;
        if(b==1&&a==0) return "i";
        if(a==0) return b+"i";
        if(b==0) return ""+a;
        if(b<0) return a+""+b+"i";
        return a+"+"+b+"i";
    }
    public double modulus(){
        return Math.sqrt(a*a+b*b);
    }
    public int quadrant(){
        if(a>0&&b>0) return 1;
        if(a<0&&b>0) return 2;
        if(a>0&&b<0) return 3;
        if(a<0&&b<0) return 4;
        return 0;
    }
    public ComplexNumber conjugate(){
        return new ComplexNumber(a,-b); 
    }
    public ComplexNumber add(ComplexNumber other){
        return new ComplexNumber(a+other.getReal(),b+other.getImaginary());
    }
    public ComplexNumber subtract(ComplexNumber other){
        return new ComplexNumber(a-other.getReal(),b-other.getImaginary());
    }
    public ComplexNumber multiply(ComplexNumber other){
        int newB = a*other.getImaginary()+b*other.getReal();
        int newA = a*other.getReal()-b*other.getImaginary();
        return new ComplexNumber(newA,newB);
    }
}
