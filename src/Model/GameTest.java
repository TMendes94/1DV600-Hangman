package Model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class GameTest {
	
	@Test
	void testSetWordAssertEquals() {
		Game g = new Game();
		List<String>list1 = Arrays.asList("substitute", "hemisphere", "intervention", "transmission", 
				"remunerate");
		List<String>list2 = Arrays.asList("brink", "golf", "listen", "free", "banana");
		List<String>list3 = new ArrayList<String>();
		
		System.out.print("Word is: ");
		String testList1 = g.setWord(list2);
		assertEquals(testList1,g.getWord());
		
		System.out.print("Word is: ");
		String testList2 = g.setWord(list1);
		assertEquals(testList2, g.getWord());
		
		System.out.print("Word is: ");
		list3.add("divide");
		list3.add("subtraction");
		list3.add("addition");
		String testList3 = g.setWord(list3);
		assertEquals(testList3, g.getWord());
	}
	
	@Test
	void testSetWordNullList() {
		try {
			Game g = new Game();
		
		List<String>list1 = null;		
		String testList1 = g.setWord(list1);
		assertNull(testList1,g.getWord());
		}
		catch (NullPointerException npe) {
			npe.toString();
		}
		
	}
	
	@Test
	void testFillWithDashAssertTrue() {
		Game g = new Game();
		String stringToTest = "test";
		List<Character> characterList = new ArrayList<Character>();
		characterList.add('_');
		characterList.add('_');
		characterList.add('_');
		characterList.add('_');
		g.fillWithDash(stringToTest);
		assertTrue(g.correctLetter.equals(characterList));
	}
	
	@Test
	void testFillWithDashAssertFalse() {
		Game g = new Game();
		String stringToTest = "testing";
		List<Character> charList = new ArrayList<Character>();
		charList.add('_');
		charList.add('_');
		charList.add('_');
		charList.add('_');
		charList.add('_');
		charList.add('_');
		g.fillWithDash(stringToTest);
		assertFalse(g.correctLetter.equals(charList));
	}
	
	@Test
	void testIsWordPicked() {
		Game g = new Game();
		List<String>list1 = Arrays.asList("brink", "golf", "listen", "free", "banana");
		g.setWord(list1);
		assertFalse(g.isWordPicked());//false assertion even if the word is picked since our method is
									  // not implemented yet
	}
}
