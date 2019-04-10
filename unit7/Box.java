public class Box {
    private double width;
    private double height;
    private double length;

    public Box(){
    }
    public Box(double w,double h,double l){
        width = w;
        height = h;
        length = l;
    }
    public String toString(){
        return "Box dimensions: "+width+" x "+height+" x "+length;
    }
}
