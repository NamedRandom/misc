import java.util.Scanner;
public class romannumeral {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Type number:\t");
    int number=scanner.nextInt();
    System.out.println(mNumeralMethod(number));
  }
  public static String mNumeralMethod(int number){
    int temp=number;
    String output="";
    boolean lessThan1000=false;
    boolean lessThan500=false;
    boolean lessThan100=false;
    boolean lessThan50=false;
    boolean lessThan10=false;

    if(temp-1000<0) lessThan1000=true;
    else if(temp-500<0)  lessThan500=true;
      else if(temp-100<0)  lessThan100=true;
        else if(temp-50<0)  lessThan50=true;
          else if(temp-10<0)  lessThan10=true;

    return "number";
  }

}
