public class Box {
    private double width;
    private double height;
    private double length;

    public Box(){
      this(0,0,0);
    }
    public Box(double w,double h,double l){
        width = w;
        height = h;
        length = l;
    }
    public Box(double w){
      this(w,w,w);
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double getLength(){
        return length;
    }
    public String toString(){
        return "box dimensions: "+getWidth()+" x "+getHeight()+" x "+getLength();
    }
    public double calcArea(){
        return 2*(width*height+height*length+height*width);
    }
    public double calcVolume(){
        return width*height*length;
    }
    public boolean nests(Box otherBox){
    if(this.calcVolume()>=otherBox.calcVolume()&&this.getLength()*this.getLength()+this.getWidth()*this.getWidth()+this.getHeight()*this.getHeight()>=otherBox.getLength()*otherBox.getLength()+otherBox.getWidth()*otherBox.getWidth()+otherBox.getHeight()*otherBox.getHeight()) return true;
        return false;
    }
    public Box biggerBox(){
        return new Box(1.25*width,1.25*height,1.25*length);
    }
    public Box smallerBox(){
        return new Box(0.75*width,0.75*height,0.75*length);
    }
}
