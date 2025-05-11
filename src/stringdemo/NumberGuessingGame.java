package stringdemo;

import java.util.Scanner;

public class NumberGuessingGame {

	int systemGuess;
	
	NumberGuessingGame(){
		this.systemGuess = (int) Math.ceil(Math.random()*100);
	}
	
	/**
	 * 
	 * @param guessNumber the number that player guessed
	 * @return
	 * - Negative if the number is smaller
	 * - 0 if number is correct
	 * - Positive if the number is higher
	 */
	
	public int guessNum(int guessNumber) {
		return guessNumber-systemGuess;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NumberGuessingGame game= new NumberGuessingGame();
		System.out.println("Welcome to guessing Game. Please enter number between 1-100.");
		int guessNum;
		int result;
		do {
			System.out.print("Enter your Number : ");
			guessNum = input.nextInt();
			result = game.guessNum(guessNum);
			if(result==0) {
				System.out.println("Congrats You Guessed Correct Number.");
			}else if(result<0) {
				System.out.println("Guess higher");
			}else {
				System.out.println("Guess lower");
			}
		}while(result!=0);
		input.close();
	}
}
