
import java.util.*;

public class hangman {
	

	public static void main(String[] args) {
		mainMenu();
	}
	
	public static void mainMenu(){
		
	System.out.println("Welcome to Hangman!");
	System.out.println("Would you like to start the game?");
	
	Scanner sc = new Scanner(System.in);
	String result = sc.next();
	
	if (result.equals("y") || result.equals("Y")) {
		play();
	}
	if (result.equals("n") || result.equals("N")) {
		quit();
	}
	sc.close();
	}
	
	public static void play() {
		System.out.println("Playing Hangman");
	};
	
	public static void quit() {
		System.out.println("Closing game");
		System.exit(0);
	}

}
