package javalanguageplayground.version4;

import org.junit.jupiter.api.Test;

public class AssertTest {

	@Test
	public void test() {

		int j = 2;
		for (int i = 1; i <= 10; i++) {
			j *= 1;
			assert isEven(j) : "j is not even, j = " + j;
		}

	}

	private boolean isEven(int j) {
		return j % 2 == 0;
	}
}
