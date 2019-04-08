public class RectangleTest {
    public static void main(String[] args){
        Rectangle rect = new Rectangle(7,1.5);

        System.out.println("Length is: "+rect.getLength());

        System.out.println(rect.toString());

        rect.setWidth(3.2);

        System.out.println(rect.toString());
    }
}
