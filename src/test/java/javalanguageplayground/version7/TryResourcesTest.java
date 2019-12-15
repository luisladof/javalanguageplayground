package javalanguageplayground.version7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class TryResourcesTest {

	private static final String PATH = "C:\\Users\\lladofre\\git\\javalanguageplayground\\src\\test\\java\\javalanguageplayground\\version7\\TryResourcesTest.java";

	@Test
	public void testReadFileBeforeJava7() {

		final File file = new File(PATH);
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			for (;;) {
				String line = reader.readLine();
				if (line != null) {
					System.out.println(line);
				} else {
					break;
				}
			}
		} catch (final FileNotFoundException e) {
			System.out.println("File not found!");
		} catch (final IOException e) {
			System.out.println("File not readable!");
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					System.out.println("Cannot close reader!");
				}
			}
		}
	}

	@Test
	public void testReadFileJava7() {

		final File file = new File(PATH);
		// See AutoCloseable interface
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			for (;;) {
				String line = reader.readLine();
				if (line != null) {
					System.out.println(line);
				} else {
					break;
				}
			}
		} catch (final FileNotFoundException e) {
			System.out.println("File not found!");
		} catch (final IOException e) {
			System.out.println("File not readable!");
		}
	}

}
