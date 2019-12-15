package javalanguageplayground.version7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javalanguageplayground.constants.Integers;
import javalanguageplayground.constants.Populations;

public class LiteralsTest {

	@Test
	public void test1() {
		Assertions.assertEquals(Populations.SPAIN_POPULATION_BEFORE_JAVA_7, Populations.SPAIN_POPULATION_JAVA_7);
	}

	@Test
	public void test2() {
		boolean eq1 = Integer.MAX_VALUE == Integers.MAX_INTEGER_DECIMAL_NOTATION;
		boolean eq2 = Integer.MAX_VALUE == Integers.MAX_INTEGER_BINARY_NOTATION;
		Assertions.assertEquals(eq1, eq2);
	}

}
