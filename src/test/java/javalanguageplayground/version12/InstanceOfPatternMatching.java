package javalanguageplayground.version12;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class InstanceOfPatternMatching {

	@Test
	public void testBeforeJava12() {

		Object o = Arrays.asList(1, 2, 3);
		// Object o = Integer.valueOf(100);

		if (o instanceof List) {
			List<?> l = (List<?>) o;
			System.out.println("The list size is: " + l.size());
		} else if (o instanceof Integer) {
			Integer i = (Integer) o;
			System.out.println("The integer value is: " + i);
		}
	}

	@Test
	public void testFromJava12Preview() {

		Object o = Arrays.asList(1, 2, 3);
		// Object o = Integer.valueOf(100);

		// Seems to be removed in JDK13...
//		if (o instanceof List l) {
//			System.out.println("The list size is: " + l.size());
//		} else if (o instanceof Integer i) {
//			System.out.println("The integer value is: " + i);
//		}

	}

}
