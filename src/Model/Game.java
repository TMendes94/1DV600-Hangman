package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Game {

	static String wordBeingPlayed;

	public List<String> hardWords = Arrays.asList("substitute", "hemisphere", "intervention", "transmission",
			"remunerate");
	public List<String> easyWords = Arrays.asList("brink", "golf", "listen", "free", "banana");
	public List<Character> correctLetter = new ArrayList<Character>();
	public static List<Character> answer = new ArrayList<Character>();

	public String setWord(List<String> list) {
		wordBeingPlayed = list.get(new Random().nextInt(list.size()));
		for (char c : wordBeingPlayed.toCharArray()) {
			answer.add(c);
		}
		fillWithDash(wordBeingPlayed);
		return wordBeingPlayed;
	} 
	
	public String getWord() {
		
		return wordBeingPlayed;
	}
	
	public void fillWithDash(String stringToReplace) {
		for (int i = 0; i < stringToReplace.length(); i++)
		{
			correctLetter.add(i, '_');
		}
		System.out.println(correctLetter.toString());
	}
	
	public boolean isWordPicked() { //implemented method for assignment 3 testing
		boolean bol = false;
		if(wordBeingPlayed.length() > 0) {
			bol = false;
		}
		return bol;
	}
}
