package javalanguageplayground.manager;

import java.util.List;
import java.util.Optional;

import javalanguageplayground.beans.Country;

public interface CountryManager {

	List<Country> getAll();
	
	Country findById(Integer id);
	
	Optional<Country> findByIdOptional(Integer id);
	
	default String getName() {
		return "Unknown Country Manager";
	}
	
	static String getKind() {
		return "A manager which returns countries information";
	}

}
