import java.util.*;

public class rps {
    public static void main(String[] args){
        
        //scanner and random objects
        Scanner input = new Scanner(System.in);
        Random rng = new Random();

        //var setup
        String username;
        

        

        //start here
        System.out.print("Welcome to Rock Paper Scissors. I, the computer, will be your opponent.\nPlease type in your name and press return: ");
        username = input.nextLine(); 

        System.out.println("\nWelcome "+username+". \nHow many games would you like to play?\nEnter the number of rounds you want to play and press return: 9");
        
    }
}

