
import java.util.*;

public class hangman {

	static List<String> hardWords = Arrays.asList("substitute", "hemisphere", "intervention", "transmission",
			"remunerate");
	static List<String> easyWords = Arrays.asList("brink", "golf", "listen", "free", "banana");

	static boolean gameStarted = false;

	public static void main(String[] args) {
		startScreen();
	}

	public static void startScreen() {

		printGreetings();

		Scanner sc = new Scanner(System.in);
		String result = sc.next();

		if (result.equals("y") || result.equals("Y")) {
			play();
		}
		if (result.equals("n") || result.equals("N")) {
			quit();
		}
		if (!result.equalsIgnoreCase("y") || !result.equalsIgnoreCase("n")) {
			System.out.println("Error: wrong input...");
			startScreen();
		}
		sc.close();
	}

	public static void play() {

		System.out.println("Please select a difficulty...");
		System.out.println("1: Easy");
		System.out.println("2: Hard");

		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();

		if (result == 1) {
			gameStarted = true;
			while (gameStarted = true) {
				int tries = 9;
				int success = 0;
				int arrayLength = new Random().nextInt(easyWords.size());

				String wordBeingDisplayed = easyWords.get(arrayLength);
				List<Character> correctLetter = new ArrayList<Character>();
				List<Character> answer = new ArrayList<Character>();
				for (char c : wordBeingDisplayed.toCharArray()) {
					answer.add(c);
				}

				System.out.println("The word contains " + wordBeingDisplayed.length() + " letters.");

				for (int i = 0; i < wordBeingDisplayed.length(); i++) {
					correctLetter.add(i, '_');
				}
				System.out.println(correctLetter.toString());

				while (tries > 0) {
					String inputLetter = sc.next();
					char charac = inputLetter.charAt(0);
					if (Character.isDigit(charac)) {
						if (charac == '3') {
							gameStarted = false;
							System.out.println("Are you sure you want to quit?");
						}
						if (charac == '4') {
							quit();
						}

						if (charac != '4') {
							continue;
						}

					}

					if (!wordBeingDisplayed.contains(inputLetter)) {
						tries--;
						System.out.println("Wrong letter, you have " + tries + " tries left");

						if (tries == 0) {
							System.out.println("YOU LOSE!");
							System.out.println("Press 1 to play again, 2 to close the game!");

							int choice = sc.nextInt();
							if (choice == 1) {
								play();
							}
							if (choice == 2) {
								quit();
							}

							if (choice != 1 && choice != 2) {
								System.out.println("Error: wrong input...");
								System.out.println("Please input 1 or 2");
							}
						}
					}

					if (wordBeingDisplayed.contains(inputLetter)) {

						for (int j = 0; j < correctLetter.size(); j++) {

							if (answer.get(j).equals(inputLetter.charAt(0))) {

								correctLetter.set(j, inputLetter.charAt(0));
								success++;
							}
						}
						System.out.println(correctLetter.toString());

						if (success == wordBeingDisplayed.length()) {
							System.out.println("YOU WIN!!!");
							System.out.println("Press 1 to play again, 2 to close the game!");

							int choice = sc.nextInt();
							if (choice == 1) {
								play();
							}
							if (choice == 2) {
								quit();
							}

							if (choice != 1 && choice != 2) {
								System.out.println("Error: wrong input...");
								System.out.println("Please input 1 or 2");
							}
						}
					}
				}
			}
		}

		if (result == 2) {
			gameStarted = true;
			while (gameStarted = true) {
				int tries = 9;
				int success = 0;
				int arrayLength = new Random().nextInt(hardWords.size());

				String wordBeingDisplayed = hardWords.get(arrayLength);
				List<Character> correctLetter = new ArrayList<Character>();
				List<Character> answer = new ArrayList<Character>();
				for (char c : wordBeingDisplayed.toCharArray()) {
					answer.add(c);
				}

				System.out.println("The word contains " + wordBeingDisplayed.length() + " letters.");

				for (int i = 0; i < wordBeingDisplayed.length(); i++) {
					correctLetter.add(i, '_');
				}
				System.out.println(correctLetter.toString());

				while (tries > 0) {
					String inputLetter = sc.next();
					char charac = inputLetter.charAt(0);
					if (Character.isDigit(charac)) {
						if (charac == '3') {
							gameStarted = false;
							System.out.println("Are you sure you want to quit?");
						}
						if (charac == '4') {
							quit();
						}

						if (charac != '4') {
							continue;
						}

					}

					if (!wordBeingDisplayed.contains(inputLetter)) {
						tries--;
						System.out.println("Wrong letter, you have " + tries + " tries left");

						if (tries == 0) {
							System.out.println("YOU LOSE!");
							System.out.println("Press 1 to play again, 2 to close the game!");

							int choice = sc.nextInt();
							if (choice == 1) {
								play();
							}
							if (choice == 2) {
								quit();
							}

							if (choice != 1 && choice != 2) {
								System.out.println("Error: wrong input...");
								System.out.println("Please input 1 or 2");
							}
						}
					}

					if (wordBeingDisplayed.contains(inputLetter)) {

						for (int j = 0; j < correctLetter.size(); j++) {

							if (answer.get(j).equals(inputLetter.charAt(0))) {

								correctLetter.set(j, inputLetter.charAt(0));
								success++;
							}
						}
						System.out.println(correctLetter.toString());

						if (success == wordBeingDisplayed.length()) {
							System.out.println("YOU WIN!!!");
							System.out.println("Press 1 to play again, 2 to close the game!");

							int choice = sc.nextInt();
							if (choice == 1) {
								play();
							}
							if (choice == 2) {
								quit();
							}

							if (choice != 1 && choice != 2) {
								System.out.println("Error: wrong input...");
								System.out.println("Please input 1 or 2");
							}
						}
					}
				}
			}
		} else if (result != 1 && result != 2) {
			System.out.println("Error: wrong input...");
			play();
		}
		sc.close();
	}

	public static void printGreetings() {

		System.out.println("Welcome to Hangman!");
		System.out.println("Would you like to start the game or exit?");
		System.out.println("Press Y to start a game and N to exit...");

	}

	public static void quit() {

		System.out.println("Closing game");
		System.exit(0);
	}

}
