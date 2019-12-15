package javalanguageplayground.version8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

import javalanguageplayground.comparator.ReverseComparator;

public class FuncionalInterfaceTest {

	private final List<Integer> integers = Arrays.asList(6, 42, 17, 89, 1, 4);

	@Test
	public void testFunctionalInterfaceBeforeJava8NamedClass() {
		Collections.sort(integers, new ReverseComparator());
		System.out.println(integers);
	}

	@Test
	public void testFunctionalInterfaceBeforeJava8AnonymousClass() {
		Collections.sort(integers, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return -1 * o1.compareTo(o2);
			}

		});

		System.out.println(integers);
	}

	@Test
	public void testFunctionalInterfaceJava8() {
		Collections.sort(integers, (o1, o2) -> -1 * o1.compareTo(o2));
		System.out.println(integers);
	}

}
