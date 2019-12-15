package javalanguageplayground.version7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javalanguageplayground.constants.CapitalCities;
import javalanguageplayground.constants.Countries;

public class SwitchTest {

	@Test
	public void test() {
		final String country = Countries.SPAIN;

		String capitalCityBeforeJava7 = getCapitalCityByCountryBeforeJava7(country);
		String capitalCityJava7 = getCapitalCityByCountryNameJava7(country);
		Assertions.assertEquals(capitalCityBeforeJava7, capitalCityJava7);
	}

	private String getCapitalCityByCountryBeforeJava7(String country) {
		if (country.equals(Countries.ARGENTINA)) {
			return CapitalCities.BUENOS_AIRES;
		} else if (country.equals(Countries.JAPAN)) {
			return CapitalCities.TOKYO;
		} else if (country.equals(Countries.SOUTH_AFRICA)) {
			return CapitalCities.CAPE_TOWN;
		} else if (country.equals(Countries.SPAIN)) {
			return CapitalCities.MADRID;
		}
		return null;
	}

	private String getCapitalCityByCountryNameJava7(String country) {
		switch (country) {
		case Countries.ARGENTINA:
			return CapitalCities.BUENOS_AIRES;
		case Countries.JAPAN:
			return CapitalCities.TOKYO;
		case Countries.SOUTH_AFRICA:
			return CapitalCities.CAPE_TOWN;
		case Countries.SPAIN:
			return CapitalCities.MADRID;
		default:
			return null;
		}

	}

}
