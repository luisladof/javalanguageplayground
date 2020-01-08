package javalanguageplayground.version8;

import java.util.Comparator;
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

		List<Country> countries = countryManager.getAll();

		for (Country country : countries) {
			System.out.println(country);
		}
	}

	@Test
	public void testIterationFromJava8WithoutLambdaExpression() {

		countryManager.getAll().forEach(new Consumer<Country>() {

			@Override
			public void accept(Country country) {
				System.out.println(country);
			}

		});
	}

	@Test
	public void testIterationFromJava8WithLambdaExpression() {
		countryManager.getAll().forEach(country -> System.out.println(country));
	}
	
	@Test
	public void testIterationFromJava8WithLambdaExpressionMethodReference() {
		countryManager.getAll().forEach(System.out::println);
	}

	@Test
	public void testRemoveIf() {
		List<Country> countries = countryManager.getAll();
		countries.removeIf(c -> c.getPopulation() < 100_000_000);
		countries.forEach(System.out::println);
	}

	@Test
	public void testSortComparingReversed() {
		List<Country> countries = countryManager.getAll();
		countries.sort(Comparator.comparing(Country::getPopulation).reversed());
		countries.forEach(System.out::println);
	}

}
