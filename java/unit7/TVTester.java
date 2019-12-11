public class TVTester {
    public static void main(String[] args){
        TV television = new TV(3);

        System.out.println(television.toString());
        television.setChannel(123);
        System.out.println(television.toString());
    }
}
