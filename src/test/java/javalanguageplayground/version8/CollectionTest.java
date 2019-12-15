package javalanguageplayground.version8;

import java.util.List;
import java.util.function.Consumer;

import org.junit.jupiter.api.Test;

import javalanguageplayground.beans.Country;
import javalanguageplayground.manager.CountryManager;
import javalanguageplayground.manager.impl.ACountryManager;

public class CollectionTest {

	private CountryManager countryManager = new ACountryManager();

	@Test
	public void testIterationBeforeJava8() {

		System.out.println("testIterationBeforeJava8");
		System.out.println("------------------------");

		List<Country> countries = countryManager.getAll();
		for (Country country : countries) {
			System.out.println(country);
		}

		System.out.println();
	}

	@Test
	public void testIterationFromJava8WithoutLambdaExpression() {

		System.out.println("testIterationFromJava8WithoutLambdaExpression");
		System.out.println("---------------------------------------------");

		countryManager.getAll().forEach(new Consumer<Country>() {

			@Override
			public void accept(Country country) {
				System.out.println(country);
			}

		});

		System.out.println();
	}

	@Test
	public void testIterationFromJava8WithLambdaExpression() {

		System.out.println("testIterationFromJava8WithLambdaExpression");
		System.out.println("------------------------------------------");

		countryManager.getAll().forEach(country -> System.out.println(country));

		System.out.println();
	}
	
	@Test
	public void testIterationFromJava8WithLambdaExpressionMethodReference() {

		System.out.println("testIterationFromJava8WithLambdaExpressionMethodReference");
		System.out.println("---------------------------------------------------------");

		countryManager.getAll().forEach(System.out::println);

		System.out.println();
	}

}
