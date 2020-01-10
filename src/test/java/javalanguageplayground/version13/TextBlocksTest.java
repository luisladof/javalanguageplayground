package javalanguageplayground.version13;

import org.junit.jupiter.api.Test;

public class TextBlocksTest {

	@Test
	public void testBeforeJava13() {

		String json = "{\n" + "\t\"name\": \"javalanguageplayground\",\n" + "\t\"version\": \"1.0-SNAPSHOT\"\n" + "}";

		System.out.println(json);
	}

	@Test
	public void testFromJava13Preview() {

		String json = """
				      {
				      	"name": "javalanguageplayground",
				      	"version": "1.0-SNAPSHOT"
				      }
				      """;

		System.out.println(json);
	}

}
