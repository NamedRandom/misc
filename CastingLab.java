public class CastingLab {
  public static void main(String[] args) {
    int i=7;
    double d=4.4;
    char c='C';
    boolean b=true;
    System.out.println("The integer I chose is "+i);
    System.out.println("One more than"+i+"is"+(i+1));
    System.out.println("One less than"+i+"is"+(i-1));
    System.out.println("The decimal i chose is "+d);
    System.out.println(d+" rounded down is "+(int)d);
    System.out.println("The character I chose is "+c);
    System.out.println("The letter before "+c+" is "+(char)((int)c-1));
    System.out.println("The letter after "+c+" is "+(char)((int)c+1));
    System.out.println("The boolean I chose is "+b);
    System.out.println("The opposite of "+b+"is "+!b);
  }
}
