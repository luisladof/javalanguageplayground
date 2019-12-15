package javalanguageplayground.version7;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;

import javalanguageplayground.beans.Country;
import javalanguageplayground.manager.CountryManager;
import javalanguageplayground.manager.impl.AnotherCountryManager;

public class TypeInferenceTest {

	private final CountryManager countryManager = new AnotherCountryManager();

	@Test
	public void testBeforeJava7() {
		List<Country> countries = countryManager.getAll();
		Map<String, Long> populationsByCountryNames = new TreeMap<String, Long>();
		processCountries(countries, populationsByCountryNames);
	}

	@Test
	public void testJava7() {
		List<Country> countries = countryManager.getAll();
		Map<String, Long> populationsByCountryNames = new TreeMap<>();
		processCountries(countries, populationsByCountryNames);
	}

	private void processCountries(List<Country> countries, Map<String, Long> populationsByCountryNames) {
		for (Country country : countries) {
			populationsByCountryNames.put(country.getName(), country.getPopulation());
		}
		System.out.println(populationsByCountryNames);
	}

}
