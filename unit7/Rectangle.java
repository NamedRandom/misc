public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double lengthIn, double widthIn){
        length=lengthIn;
        width=widthIn;
    }
    
    public double area(){
        return length*width;
    }

    public double perimeter(){
        return 2*length+2*width;
    }

    public String toString(){
        return "Area is: "+area()+" Perimeter is: "+perimeter();
    }
    
    public void setWidth(double input){
        width = input;
    }

    public void setLength(double input){
        length = input;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }
}
