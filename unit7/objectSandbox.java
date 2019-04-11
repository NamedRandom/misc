public class objectSandbox {
    public static void main(String[] args){
        Box[] boxArray = new Box[2];
        boxArray[0] = new Box(2.5,12.2,6.0);
        boxArray[1] = new Box(6.0,6.0,6.0);

        for(Box b:boxArray){
        System.out.println(b);
        System.out.println("Box with area "+b.calcArea()+" and volume "+b.calcVolume()+"\n");

        }
    }
}
