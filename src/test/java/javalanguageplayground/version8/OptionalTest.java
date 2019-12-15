package javalanguageplayground.version8;

import java.util.Optional;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import javalanguageplayground.beans.Country;
import javalanguageplayground.manager.CountryManager;
import javalanguageplayground.manager.impl.ACountryManager;

public class OptionalTest {

	private CountryManager countryManager = new ACountryManager();
	// private CountryManager countryManager = new AnotherCountryManager();

	@ParameterizedTest
	@ValueSource(ints = { 133291, 7876878 })
	public void testBeforeJava8(final Integer id) {
		Country country = countryManager.findById(id);

		if (country != null) {
			System.out.println(country);
		} else {
			System.out.println("No country found for id = " + id);
		}
	}

	@ParameterizedTest
	@ValueSource(ints = { 133291, 7876878 })
	public void testJava8Imperative(final Integer id) {
		Optional<Country> optional = countryManager.findByIdOptional(id);

		if (optional.isPresent()) {
			System.out.println(optional.get());
		} else {
			System.out.println("No country found for id = " + id);
		}
	}

	@ParameterizedTest
	@ValueSource(ints = { 133291, 7876878 })
	public void testJava8Functional(final Integer id) {
		countryManager.findByIdOptional(id).ifPresentOrElse(System.out::println,
				() -> System.out.println("No country found for id = " + id));
	}

}
