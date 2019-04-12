public class PointTester {
    public static void main(String[] args){
        Point p1 = new Point(3,9);
        Point p2 = new Point();

        //testing toString
        System.out.println("p1: "+p1);
        System.out.println("p2: "+p2);

        //test setX and getY
        p1.setX(p2.getY());
        System.out.println("Changing p1's X to p2's Y: "+p1);

        //test setY and getX
        p1.setY(12.7);
        p2.setX(p1.getX());
        System.out.println("Set p1's Y to 12.7: "+p1);
        System.out.println("Set p2's X to p1's X: "+p2);

        //test translate
        p1.translate(1,-4);
        System.out.println("Translating p1 (1,-9): "+p1);


        //testing printWarning
        Point origin = new Point();
        Point tooClose = new Point(1,1);
        Point safe = new Point(100,10);

        origin.printWarning();
        tooClose.printWarning();
        safe.printWarning();
    }
}
