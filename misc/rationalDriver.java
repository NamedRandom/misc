public class rationalDriver {
    public static void main(String[] args){
        Rational defaultRational = new Rational();
        Rational fortyOverTwelve = new Rational(40,12);

        System.out.println("Default rational: "+defaultRational+" default value: "+defaultRational.getValue()); 
        System.out.println("40/12 rational: "+fortyOverTwelve+" 40/12 getValue(): "+fortyOverTwelve.getValue());

    }
}
