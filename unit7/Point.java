public class Point {
    private double x;
    private double y;

    public Point(double newX, double newY){
        x=newX;
        y=newY;
    }
    public Point(){}
    
    public void translate(int dx,int dy){
        x+=dx;
        y+=dy;
    }
    public void printWarning(){
        if(this.distanceFromOrigin()==0) System.out.println("it's the same point");
        else if(this.distanceFromOrigin()>3.14) System.out.println("it's a safe distance");
        else if(this.distanceFromOrigin()<=3.14) System.out.println("it's too close");
    }
    public double distanceFromOrigin(){
        return Math.sqrt((0-x)*(0-x)+(0-y)*(0-y));
    }
    public String toString(){
        return "("+x+","+y+")";
    }
    public void setX(double input){
        x = input;
    }
    public void setY(double input){
        y = input;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}
