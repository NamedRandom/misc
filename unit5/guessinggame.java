import java.util.*;

public class guessinggame {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rng = new Random();
		
		
		//var stuff
		int userInput,findThisNumber,gameCounter,guessCounter;
		boolean playAgain,numberHasNotBeenGuessed;
		guessCounter = 0;	
		gameCounter = 0;
		
		do{
			//reset vars
			gameCounter += 1;
			playAgain = false;	
			findThisNumber = rng.nextInt(101);
			System.out.println(findThisNumber);
			numberHasNotBeenGuessed = true;
	

			System.out.println("GAME "+gameCounter);
			while(numberHasNotBeenGuessed){
				guessCounter += 1;

				System.out.println("Guess #"+guessCounter+"");
				userInput = input.nextInt();
				if(userInput==findThisNumber) {
					
					numberHasNotBeenGuessed=false;
					System.out.println("You guessed correctly");
				}
				if(userInput>findThisNumber) System.out.println("Too high!");
				if(userInput<findThisNumber) System.out.println("Too low!");
			}
			

			// ask user if they want to play again
			System.out.println("Would you like to play again?");
			String plsStop = input.nextLine();
			if(input.nextLine().toUpperCase().equals("YES")) playAgain = true;

		}while(playAgain);
	}
}
