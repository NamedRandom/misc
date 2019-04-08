
public class TelescopeTester {
    public static void main(String[] args){
        
        Telescope tele = new Telescope(3.0,6.5,0.8);
        
        System.out.println( "Diameter: "+ tele.getDiameter ()); 
        System.out.println( "Length of the main lens: "+ tele.getMainLength());
        System.out.println( "Eyepiece: "+ tele.getEyeLength());
        System.out.println(tele);
        System.out.println("Power: "+ tele.calcMagnification()+ "  F-number: "+tele.calcFNumber() );
        tele.setMainLength(7.5);
        System.out.println("New Power: "+ tele.calcMagnification());


    }
}
