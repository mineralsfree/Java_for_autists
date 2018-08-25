import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class CountLinesTest {

	@Test
	void countLinesTest() throws IOException {
		final int answer = 5;
		int countLine = CountLines.countLines("test1.txt");
		
		assertEquals(countLine, answer);
		
	}
	@Test
	void emptyFileTest() throws IOException {
		final int answer = 0;
		int countLine = CountLines.countLines("test2.txt");

		assertEquals(countLine, answer);
	}
}
