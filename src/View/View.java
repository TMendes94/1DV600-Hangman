package View;

import java.util.Scanner;

public class View {

	Scanner sc = new Scanner(System.in);

	public int getInt() {
		return sc.nextInt();
	}

	public String getString() {
		return sc.next();

	}

	public void printGreetings() {
		System.out.println("Welcome to Hangman!");
	}
	
	public void printStartMenu() {
		System.out.println("Would you like to start the game or exit?");
		System.out.println("Press Y to start a game and N to exit...");
	}

	public void printDifficulties() {
		System.out.println("Please select a difficulty...");
		System.out.println("1: Easy");
		System.out.println("2: Hard");
	}
	
	
	public void printWordLength(int wordLength) {
		System.out.println("The word contains " + wordLength + " letters.");
	}
	public void guess() {
		System.out.println("Guess a letter:");
	}
	public void printLives(int tries) {
		System.out.println("Wrong letter, you have " + tries + " tries left");
    }

	public void printOnLoss() {
		System.out.println("YOU LOSE!");
		System.out.println("Press 1 to play again, 2 to close the game!");
	}
	
	public void printOnWin() {
		System.out.println("YOU WIN!!!");
		System.out.println("Press 1 to play again, 2 to close the game!");
	}

	public void printOnWrongInput() {
		System.out.println("Error: wrong input...");
	}

	public void printOnExit() {
		System.out.println("Closing game");
	}
	
	public void printConfirmation() {
		System.out.println("Are you sure you want to quit? Press 4 to confirm... or continue guessing");
	}
	
	public void printWrongConfirmation() {
		printOnWrongInput();
		System.out.println("Press 4 to exit... or continue guessing");
	}
}