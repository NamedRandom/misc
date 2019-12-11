import java.util.Scanner;

public class parsingbonuslab
{
    public static void main (String[] args)
    {
   // Variable Declarations
     String declaration;
     String variableType;
     String variable;
   String value;
   int indexOfBlank;
   int indexOfAssnOp;

   Scanner scan = new Scanner (System.in);

   // Prompt the user and read in a Java declaration/initialization
   System.out.print ("Enter a declaration/initializtion statement: ");
   declaration = scan.nextLine();

   // *** Use the indexOf method to find the index of the first blank
   // character - store it in the indexOfBlank variable
   indexOfBlank=declaration.indexOf(' ');

   // *** Use the substring method to "extract" the type from the
   // declaration string - store it in variableType
   variableType=declaration.substring(0,indexOfBlank);

   // *** Use the indexOf method to find the index of the assignment
   // operator - store it in the variable provided (see declarations
   // above).
   indexOfAssnOp=declaration.indexOf(' ',declaration.indexOf(' ')+1);

   // *** Use the substring method to "extract" the variable name
   // from the declaration - store the result in the appropriate
   // variable
   variable=declaration.substring(declaration.indexOf(' '),indexOfAssnOp);

   // *** Use the substring method to extract the value from the
   // declaration (how do you know where the end of that substring
   // is?)
   value=declaration.substring(declaration.indexOf('=')+1,declaration.length()-1);


   // Print the results
   System.out.println();
   System.out.println ("Declaration/Initialization: " + declaration);
   System.out.println ("Variable type: " + variableType);
   System.out.println ("Variable name: " + variable.trim());
   System.out.println ("Initial value: " + value.trim());
   System.out.println();
   }
}
