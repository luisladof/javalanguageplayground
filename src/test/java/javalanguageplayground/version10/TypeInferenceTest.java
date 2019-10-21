package javalanguageplayground.version10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TypeInferenceTest {
	
	@Test
	public void test() {
		final var i = Integer.valueOf("1");
		Assertions.assertEquals(i.getClass(), Integer.class);
	}

}
