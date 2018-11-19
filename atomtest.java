public class atomtest{
  public static void main(String[] args) {
    String s=("hello this is a string");
    // System.out.println(s); //print s
    // String firstWordOfS=(s.substring(0,s.indexOf(' '))); //get first word of s (substring of 0 and first whitespace)
    // System.out.println(firstWordOfS); //print first Word Of S
    //
    // s=(s.substring(s.indexOf(' ')+1,s.length())); //remove first word of s (substring of first whitespace to end)
    // System.out.println(s); //print s
    // String secondWordOfS=(s.substring(0,s.indexOf(' '))); //print only secondWordOfS
    // System.out.println(secondWordOfS); //print second Word Of S
    //
    // s=(s.substring(s.indexOf(' ')+1,s.length())); //remove first word of s (substring of first whitespace to end)
    // System.out.println(s); //print s
    // String thirdWordOfS=(s.substring(0,s.indexOf(' '))); //print only secondWordOfS
    // System.out.println(thirdWordOfS); //print second Word Of S
    //
    // s=(s.substring(s.indexOf(' ')+1,s.length())); //remove first word of s (substring of first whitespace to end)
    // System.out.println(s); //print s
    // String fourthWordOfS=(s.substring(0,s.indexOf(' '))); //print only secondWordOfS
    // System.out.println(fourthWordOfS); //print second Word Of S
    //
    // s=(s.substring(s.indexOf(' ')+1,s.length())); //remove first word of s (substring of first whitespace to end)
    // System.out.println(s); //print s
    // String fifthWordOfS=s;
    // System.out.println(fifthWordOfS);
    // s=("hello this is a string");
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
    System.out.println(firstWordOfS+" "+secondWordOfS+" "+thirdWordOfS+" "+fourthWordOfS+" "+fifthWordOfS);
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
