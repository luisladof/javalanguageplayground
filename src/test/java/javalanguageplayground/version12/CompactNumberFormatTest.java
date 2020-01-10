package javalanguageplayground.version12;

import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.Locale;

import org.junit.jupiter.api.Test;

import javalanguageplayground.manager.CountryManager;
import javalanguageplayground.manager.impl.ACountryManager;

public class CompactNumberFormatTest {

	private CountryManager countryManager = new ACountryManager();

	@Test
	public void test() {

		var nfLongDefault = NumberFormat.getCompactNumberInstance(Locale.getDefault(), Style.LONG);
		var nfShortEn = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, Style.SHORT);

		countryManager.getAll().forEach(c -> System.out
				.println("La poblacion de " + c.getName() + " es: " + nfLongDefault.format(c.getPopulation())));
		countryManager.getAll().forEach(c -> System.out
				.println("The population of " + c.getName() + " is: " + nfShortEn.format(c.getPopulation())));
	}

}
