package javalanguageplayground.version10;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class LocalVariableTypeInferenceTest {

	@Test
	public void testBeforeJava7() {
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("Luis", 104801);
		System.out.println(m.get("Luis"));
	}

	@Test
	public void testBeforeJava10() {
		Map<String, Integer> m = new HashMap<>();
		m.put("Luis", 104801);
		System.out.println(m.get("Luis"));
	}

	@Test
	public void testFromJava10() {
		var m = new HashMap<String, Integer>();
		m.put("Luis", 104801);
		System.out.println(m.get("Luis"));
	}

}
