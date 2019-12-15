package javalanguageplayground.version8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

import javalanguageplayground.beans.Country;
import javalanguageplayground.manager.CountryManager;
import javalanguageplayground.manager.impl.ACountryManager;

public class FunctionLambdaExpressionMethodReferenceTest {

	private CountryManager countryManager = new ACountryManager();

	@Test
	public void testFunction() {
		// If there is only parameter to the function, parentheses can be omitted.
		Function<Double, Double> circleArea = r -> Math.PI * Math.pow(r, 2);
		System.out.println(circleArea.apply(4.0));
	}

	@Test
	public void testBiFunction() {
		BiFunction<Double, Double, Double> pythagoras = (a, b) -> Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		// Alternative with lambda result as a code block
		// BiFunction<Double, Double, Double> pythagoras = (a, b) -> {
		// Double a2 = Math.pow(a, 2);
		// Double b2 = Math.pow(b, 2);
		// return Math.sqrt(a2 + b2);
		// };
		System.out.println(pythagoras.apply(3.0, 4.0));
	}

	@Test
	public void testConsumer() {
		Consumer<String> stdout = s -> System.out.println(s);
		// Alternative with method reference
		// Consumer<String> stdout = System.out::println;
		stdout.accept("Print me!");
	}

	@Test
	public void testSupplier() {
		Supplier<List<Integer>> fib = () -> Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21);
		System.out.println(fib.get());
	}

	@Test
	public void testBiPredicate() {
		BiPredicate<String, String> startsWith = (s, l) -> s.startsWith(l);
		// Alternative with method reference
		// BiPredicate<String, String> startsWith = String::startsWith;
		System.out.println(startsWith.test("Luis", "K"));
	}

	@Test
	public void testMethodReferenceExistingObject() {

		ExecutorService executorService = Executors.newSingleThreadExecutor();

		Future<List<Country>> future = executorService.submit(countryManager::getAll);

		try {
			System.out.println(future.toString());
			future.get().stream().forEach(System.out::println);
			System.out.println(future.toString());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

	}

}
