package javalanguageplayground.manager.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javalanguageplayground.beans.Country;
import javalanguageplayground.manager.CountryManager;

public class AnotherCountryManager implements CountryManager {

	public List<Country> getAll() {
		List<Country> countries = new ArrayList<Country>();

		countries.add(new Country(929, "Spain", "Madrid", 46_934_632L));
		countries.add(new Country(543, "Japan", "Tokyo", 126_140_000L));
		countries.add(new Country(786, "Argentina", "Buenos Aires", 44_938_712L));
		countries.add(new Country(812, "South Africa", "Cape Town", 58_775_022L));
		countries.add(new Country(265, "China", "Beijing", 1_400_230_000L));

		return countries;
	}

	@Override
	public Country findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Country> findByIdOptional(Integer id) {
		// TODO Auto-generated method stub
		// Beware!
		// return null;
		return Optional.ofNullable(null);
	}

}
