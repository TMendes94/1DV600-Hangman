package Model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class GameTest {
	Game g = new Game();
	private List<String> list1;
	private List<String> list2;

	@Before
	void setup() {
		list1 = Arrays.asList("substitute", "hemisphere", "intervention", "transmission",
				"remunerate");
		list2 = Arrays.asList("brink", "golf", "listen", "free", "banana");
	}
	
	@Test
	void testSetWord() {
		String test = g.setWord(list1);
		assertTrue(list1.isEmpty());
	}

}
