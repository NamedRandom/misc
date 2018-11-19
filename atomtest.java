public class atomtest{
  public static void main(String[] args) {
    String s=("milk essential of wild whiskers");
    String firstWordOfS=wordOfString(s,1);
    System.out.println(firstWordOfS);
    String secondWordOfS=wordOfString(s,2);
    System.out.println(secondWordOfS);
    String thirdWordOfS=wordOfString(s,3);
    System.out.println(thirdWordOfS);
    String fourthWordOfS=wordOfString(s,4);
    System.out.println(fourthWordOfS);
    String fifthWordOfS=wordOfString(s,5);
    System.out.println(fifthWordOfS);
    System.out.println(firstWordOfS+" "+secondWordOfS+" "+thirdWordOfS+" "+fourthWordOfS+" "+fifthWordOfS+"\n\n");
    String integersAreGay="0 0 0 0 0";
    System.out.print(firstWordOfS.charAt(Integer.parseInt(wordOfString(integersAreGay,1))));
    System.out.print(secondWordOfS.charAt(Integer.parseInt(wordOfString(integersAreGay,2))));
    System.out.print(thirdWordOfS.charAt(Integer.parseInt(wordOfString(integersAreGay,3))));
    System.out.print(fourthWordOfS.charAt(Integer.parseInt(wordOfString(integersAreGay,4))));
    System.out.print(fifthWordOfS.charAt(Integer.parseInt(wordOfString(integersAreGay,5))));

  }

  public static String wordOfString(String stringIn,int wordOfString){
    for (int i=1;i<wordOfString;i++){
      stringIn=(stringIn.substring(stringIn.indexOf(' ')+1,stringIn.length()));
    }
    boolean isDoesContainsWhiteSpace=stringIn.contains(" ");
    for(;isDoesContainsWhiteSpace==false;)
      return stringIn;
    return (stringIn.substring(0,stringIn.indexOf(' ')));
  }
}
