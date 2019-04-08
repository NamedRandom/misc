public class Telescope {
    private double diameter;
    private double mainLength;
    private double eyeLength;

    public Telescope(double dia, double main, double eye){
        diameter = dia;
        mainLength = main;
        eyeLength = eye;
    }

    public double getDiameter(){
        return diameter;
    }

    public double getMainLength(){
        return mainLength;
    }

    public double getEyeLength(){
        return eyeLength;
    }

    public void setDiameter(double input){
        diameter = input;
    }

    public void setMainLength(double input){
        mainLength = input;
    }

    public void setEyeLength(double input){
        eyeLength = input;
    }

    public double calcMagnification(){
        return mainLength/eyeLength;
    }

    public double calcFNumber(){
        return mainLength/diameter;
    }
    public String toString(){
        return "Diameter is "+diameter+", mainLength is "+mainLength+", eyeLength is "+eyeLength;
    }
}
