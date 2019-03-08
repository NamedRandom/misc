public class basicarrays2 {
    public static void main(String[] args){
        String[] names = {"Frew", "Manley"};
        int[] favoriteNumbers = {0, 2, 8, 208};
        double[] latitudes = {90.27, 90.30, 90.41};
        char[] word = {'H', 'E', 'L', 'L', 'O'};

            System.out.println("Length: "+names.length);
            System.out.println("Last index: "+(names.length-1));
            System.out.println("Last element: "+names[names.length-1]);
            System.out.println("Second to last element: "+names[names.length-2]);
            System.out.println();
            System.out.println("Length: "+word.length);
            System.out.println("Last index: "+(word.length-1));
            System.out.println("Last element: "+word[word.length-1]);
            System.out.println("Second to last element: "+word[word.length-2]);
            System.out.println();
            System.out.println("Length: "+latitudes.length);
            System.out.println("Last index: "+(latitudes.length-1));
            System.out.println("Last element: "+latitudes[latitudes.length-1]);
            System.out.println("Second to last element: "+latitudes[latitudes.length-2]);
            System.out.println();
            System.out.println("Length: "+favoriteNumbers.length);
            System.out.println("Last index: "+(favoriteNumbers.length-1));
            System.out.println("Last element: "+favoriteNumbers[favoriteNumbers.length-1]);
            System.out.println("Second to last element: "+favoriteNumbers[favoriteNumbers.length-2]);


    }
}
