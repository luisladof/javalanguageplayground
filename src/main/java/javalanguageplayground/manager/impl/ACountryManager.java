package javalanguageplayground.manager.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javalanguageplayground.beans.Country;
import javalanguageplayground.manager.CountryManager;

public class ACountryManager implements CountryManager {

	public List<Country> getAll() {

		// Simulate delay
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<Country> countries = new ArrayList<Country>();

		countries.add(new Country(112323, "Spain", "Madrid", 46736776L));
		countries.add(new Country(114762, "Japan", "Tokyo", 126860301L));
		countries.add(new Country(104424, "Argentina", "Buenos Aires", 44780677L));
		countries.add(new Country(133291, "South Africa", "Cape Town", 58558270L));
		countries.add(new Country(100378, "India", "New Dehli", 1366417754L));

		return countries;
	}

	@Override
	public Optional<Country> findByIdOptional(Integer id) {
		return getAll().stream().filter(f -> f.getId().equals(id)).findFirst();
	}

	public String getName() {
		return "A Country Manager";
	}

	@Override
	public Country findById(Integer id) {
		List<Country> countries = getAll();
		for (Country country : countries) {
			if (country.getId().equals(id)) {
				return country;
			}
		}
		return null;
	}

}
