public class booleanzen{

   public static void main(String[] args)
   {
   //#1
      int  a = 3, b = 12, c = 10;
      System.out.println(b+" is a multiple of "+ a+ "\t"+ multiple(a,b));// true
      System.out.println(c+" is a multiple of "+ a+ "\t"+ multiple(a,c));// false
      System.out.println("//");
   //#2
      int bb=85, cc=2, dd=9;
      System.out.println(a+" is not greater than the square root of "+bb+"\t"+squareRoot (a,bb));
      System.out.println(a+" is not greater than the square root of "+cc+"\t"+squareRoot (a,cc));
      System.out.println(a+" is not greater than the square root of "+dd+"\t"+squareRoot (a,dd));
      System.out.println("//");
   //#3
      int a1=13, a2=8, a3=-13, a4=-32;
      System.out.println("abs value of "+a1+" is  greater than abs value of "+a2+"\t\t"+magnitude(a1, a2));
      System.out.println("abs value of "+a3+" is  greater than abs value of "+a4+"\t"+magnitude(a3, a4));
      System.out.println("abs value of "+a2+" is  greater than abs value of "+a3+"\t"+magnitude(a2, a3));
      System.out.println("abs value of "+a4+" is  greater than abs value of "+a1+"\t"+magnitude(a4, a1));
      System.out.println("//");
   //#4
      int x1=3, x2=13, x3=-4, x4=0, x5=-12 ;
      System.out.println(x1+" is a nonnegative one-digit number\t"+oneDigit(x1));
      System.out.println(x2+" is a nonnegative one-digit number\t"+oneDigit(x2));
      System.out.println(x3+" is a nonnegative one-digit number\t"+oneDigit(x3));
      System.out.println(x4+" is a nonnegative one-digit number\t"+oneDigit(x4));
      System.out.println(x5+" is a nonnegative one-digit number\t"+oneDigit(x5));
      System.out.println("//");
   //#5
      int d=13, e=13, f=-13, g=45 ;
      System.out.println(d+" is opposite to "+e+"\t"+opposite(d, e));
      System.out.println(d+" is opposite to "+f+"\t"+opposite(d, f));
      System.out.println(f+" is opposite to "+d+"\t"+opposite(f, d));
      System.out.println(f+" is opposite to "+g+"\t"+opposite(f, g));
      System.out.println("//");
      //#6
      String str1="Sam", str2="One", str3="Onetwo", str4="ON" ;
      System.out.println(str1+" is longer than "+str2+"\t"+longer(str1, str2));
      System.out.println(str1+" is longer than "+str4+"\t"+longer(str1, str4));
      System.out.println(str1+" is longer than "+str3+"\t"+longer(str1, str3));
      System.out.println(str4+" is longer than "+str3+"\t"+longer(str4, str3));
      System.out.println("//");
      //#8
      char n1='Z', n2=' ', n3='8', n4='b';
      System.out.println(n1+" is a whiteSpace or a digit\t"+check(n1));
      System.out.println(n2+" is a whiteSpace or a digit\t"+check(n2));
      System.out.println(n3+" is a whiteSpace or a digit\t"+check(n3));
      System.out.println(n4+" is a whiteSpace or a digit\t"+check(n4));
      System.out.println("//");
   }
// YOUR METHODS GO HERE

//     1. Given two integer values x and y, return true if  y is a multiple of x.
// multiple(3,12) → true
// multiple(3,10) → false

public static boolean multiple(int x, int y) {
// your code here
	return(y%x==0);
}

//     2. Given two integer values x and y, return true if   x is not greater than the square root of y.
// squareRoot (3,85) → true
// squareRoot (3,2) → false

public static boolean squareRoot(int x, int y) {
// your code here
	return (Math.sqrt(y)>x);
}

// 3. Given two integer values x and y, return true if   x is greater in magnitude (absolute value) than y.
// magnitude (-13,8) → true
// magnitude (13,-32) → false

public static boolean magnitude (int x, int y) {
// your code here
	return (Math.abs(x)>Math.abs(y));
}
// 4. Given an integer value x, return true if   x is a nonnegative one-digit number.
// oneDigit (3) → true
// oneDigit (13) → false
// oneDigit (-4) → false
// oneDigit (0) → true
// oneDigit (-12) → false


public static boolean oneDigit (int x) {
// your code here
	return (x-10<0&&x>-1);
}
// 5. Given two integer values x and y, return true if   x and y have opposite signs.
// opposite (-13,13) → true
// opposite (-13,13) → false
// opposite (13,2) → false
// opposite (3,-10) → true

public static boolean opposite (int x, int y) {
// your code here
	return(x>0&&y<0||x<0&&y>0);
}

// 6. Given two String values str1, str2, return true if   the  length of str1 is greater than the length of str2.
// longer (“Sammmy”,”do”) → true
// longer (“Sam”,”one”) → false
// longer (“Sam”,”onetwo”) → false

public static boolean longer (String str1, String str2) {
// your code here
	return (str1.length()>str2.length());
}
// 7. Given two String values str1, str2, return true if   str1 is a substring of str2.
// part (“sun”,”sunny”) → true
// part (“sunny”,”sun”) → false
// part (“sun”,”moon”) → true

public static boolean part (String str1, String str2) {
// your code here
	return (str2.contains(str1));
}

// 8. Given a char value ccc return true if   ccc is a digit or a whitespace.
// check (‘P’) → false
// check (‘ ’) → true
// check (‘8’) → true

public static boolean check (char given) {
	// your code here
	return (given==' '||given=='0'||given=='1'||given=='2'||given=='3'||given=='4'||given=='5'||given=='6'||given=='7'||given=='8'||given=='9');
}
}
