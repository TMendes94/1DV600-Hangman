package Controller;

import java.util.Scanner;

import Model.Game;

public class Controller {

	static Scanner sc = new Scanner(System.in);
	static String choice;
	private static int tries = 9;
	private static String word;
	private static boolean gameStarted = false;
	public static int success = 0;

	public void start(View.View v, Model.Game g) {
		v.printStartMenu();

		switch (v.getString()) {

		case "y":
		case "Y":
			game(v, g);

		case "n":
		case "N":
			v.printOnExit();
			break;
		default:
			v.printOnWrongInput();
			start(v, g);
			break;
		}
	}

	public static void game(View.View v, Model.Game g) {
		v.printDifficulties();
		switch (v.getString()) {
		case "1":
			gameStarted = true;
			word = g.setWord(g.easyWords);
			v.printWordLength(word.length());
			guess(v, g);
			break;

		case "2":
			gameStarted = true;
			word = g.setWord(g.hardWords);
			v.printWordLength(word.length());
			guess(v, g);
			break;
		default:
			v.printOnWrongInput();
			game(v, g);
		}
	}

	public static void guess(View.View v, Model.Game g) {

		while (tries > 0) {

			if (gameStarted == false) {
				choice = sc.next();

				if (choice.equals("1")) {
					g = new Game();
					tries = 9;
					success = 0;
					g.correctLetter.clear();
					Game.answer.clear();
					game(v, g);
				}
				if (choice.equals("2")) {
					v.printOnExit();
					break;
				}
				if (!choice.equals("1") || !choice.equals("2")) {
					v.printOnWrongInput();
					g = new Game();
					tries = 9;
					success = 0;
					g.correctLetter.clear();
					Game.answer.clear();
					game(v, g);
				}
			}

			Scanner sc = new Scanner(System.in);

			String input = sc.next();
			char charac = input.charAt(0);
			if (Character.isDigit(charac)) {
				if (charac == '3') {
					v.printConfirmation();
					input = sc.next();
					charac = input.charAt(0);
					if (charac == '4') {
						v.printOnExit();
						break;
					}
				}
			}

			if (!word.contains(input)) {
				if (Character.isDigit(charac)) {
					v.printOnWrongInput();
					v.guess();
				} else {
					tries--;
					v.printLives(tries);
					v.printHangman(tries);
				}
				if (tries == 0) {
					gameStarted = false;
					v.printOnLoss();
				}
			}
			if (word.contains(input)) {
				for (int j = 0; j < g.correctLetter.size(); j++) {

					if (Game.answer.get(j).equals(input.charAt(0))) {
						g.correctLetter.set(j, input.charAt(0));
						success++;
					}
				}
				System.out.println(g.correctLetter.toString());

				if (success == word.length()) {
					gameStarted = false;
					v.printOnWin();
				}
			}
		}
	}
}
