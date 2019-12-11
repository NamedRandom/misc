import java.util.Scanner;
public class romannumeral {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Type number: ");
    int number=scanner.nextInt();
    System.out.println("Roman Numeral: "+convertToRoman(number));
  }

  public static String convertToRoman(int number){
    String output="";
    for(int i=1;i<=number;i++) output+="I";
    output=output.replaceAll("IIIII","V");
    output=output.replaceAll("IIII","IV");
    output=output.replaceAll("VV","X");
    output=output.replaceAll("VIV","IX");
    output=output.replaceAll("XXXXX","L");
    output=output.replaceAll("XXXX","XL");
    output=output.replaceAll("IIIII","V");
    output=output.replaceAll("LXL","XC");
    output=output.replaceAll("LL","C");
    output=output.replaceAll("CCCCC","D");
    output=output.replaceAll("CCCC","CD");
    output=output.replaceAll("DCD","CM");
    output=output.replaceAll("DD","M");
    return output;
  }

}
