public class TemperatureTester{
    public static void main(String[] args){
        Temperature celsius0 = new Temperature();
        Temperature fahrenheit32 = new Temperature(32,'F');
        Temperature celsius100 = new Temperature(100);
        Temperature fahrenheit212 = new Temperature('F');
        
        System.out.println(celsius0);
        System.out.println(celsius100);
        System.out.println(fahrenheit32);
        System.out.println(fahrenheit212);

        //test setTemp
        fahrenheit212.setTemp(212); 
        System.out.println(fahrenheit212);

        //equality tests:
        System.out.println(fahrenheit212.equals(celsius100)); //true
        System.out.println(fahrenheit32.equals(celsius100)); //false
        System.out.println(fahrenheit32.equals(celsius0)); //true
        System.out.println(fahrenheit32.equals(celsius100)); //false
        
        Temperature temp1 = new Temperature(5,'C');
        Temperature temp2 = new Temperature(8,'C');
        System.out.println(celsius100.isLessThan(temp1)); //false
        System.out.println(celsius100.isGreaterThan(temp1)); //true
        System.out.println(temp1.isLessThan(temp2)); //true
        System.out.println(temp1.isGreaterThan(temp2)); //false

        //test setScale
        System.out.println(celsius100);
        celsius100.setScale('F');
        System.out.println(celsius100);

        //test setBoth
        System.out.println(celsius0);
        celsius0.setBoth(celsius0.getFahrenheit(),'F');
        System.out.println(celsius0);
        //test getTemp methods
        System.out.println(fahrenheit32);
        System.out.println(fahrenheit32.getCelsius());
        System.out.println(fahrenheit32.getFahrenheit());

    }
}
