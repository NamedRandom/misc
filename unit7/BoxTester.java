public class BoxTester {
    public static void main(String[] args){
        
        //part 1
        Box[] boxArray = new Box[2];
        boxArray[0] = new Box(2.5,12.2,6.0);
        boxArray[1] = new Box(6.0,6.0,6.0);

        for(Box b:boxArray){
        System.out.println(b);
        System.out.println("Box with area "+b.calcArea()+" and volume "+b.calcVolume()+"\n");
        }

        //part 2
        Box box1 = new Box(4.0,2.0,3.0);
        System.out.println("Box1: "+box1);

        Box box2 = box1.biggerBox();
        System.out.println("Box2: "+box2);
        
        System.out.println("\nDoes box2 fit in box1? "+box1.nests(box2));
        System.out.println("Does box1 fit in box2? "+box2.nests(box1));

        Box box3 = box1.smallerBox();
        System.out.println("\nBox3: "+box3);

        System.out.println("Does box3 fit in box2? "+box2.nests(box3));
        System.out.println("Does box1 fit in box2? "+box2.nests(box1));
        System.out.println("Does box1 fit in box3? "+box3.nests(box1));

        //bonus tester
        Box boxButTall = new Box(6.0,12.0,6.0);
        Box boxButWide = new Box(12.0,6.0,6.0);
        Box boxButWideAndTall = new Box(12.0,12.0,6.0);
        System.out.println("\nboxButTall "+boxButTall);
        System.out.println("boxButWide "+boxButWide);
        System.out.println("boxButWideAndTall "+boxButWideAndTall);

        System.out.println("\nDoes boxButTall fit in boxButWide? "+boxButWide.nests(boxButTall));
        System.out.println("Does boxButWide fit in boxButTall? "+boxButTall.nests(boxButWide));
        System.out.println("Does boxButWideAndTall fit in boxButTall? "+boxButTall.nests(boxButWideAndTall));

    }
}
