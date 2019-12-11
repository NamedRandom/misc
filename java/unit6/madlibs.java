public class madlibs { 
       public static void main(String[] args) 
      { 
         String[] nouns = {"banana", "Ferrari", "hammer", "guacamole", "bug-eyed monster","computer","pencil","chair","wall","printer"};
         String[] verbs = {"eat", "drive", "whack", "transmogrify","jump","click","scroll","walk","sleep"};
         String[] adjectives = {"red","wet","blue","yellow","angry","loud","dumb","gross","idiotic","bright"};
         String[] daysOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

         System.out.println("Here is a story just for you\n"); 
         tellStory(nouns,verbs,adjectives,daysOfWeek); // generate and display the story 
      } // end of main() 
      
       public static String getWord(String[] words) { 
         int size = words.length; // get the size of the array 
         int index = (int)(Math.random() * size); // random # must be < size 
         return words[index]; // send back the word at that index 
      } // end of getWord() method 
      
   
       public static void tellStory(String[] nouns, String[] verbs,String[] adjective,String[] daysOfWeek){ 
        System.out.println("There was a kid who had a "+getWord(adjective)+" "+getWord(nouns));
        System.out.println("It was just a normal "+getWord(daysOfWeek)+", and he was using his "+getWord(nouns)+" to "+getWord(verbs)+" the "+getWord(nouns));
        System.out.println("The end.");
       } // end of tellStory() method 
   
   } // end of Madlib class 
