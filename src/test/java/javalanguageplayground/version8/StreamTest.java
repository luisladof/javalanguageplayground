package javalanguageplayground.version8;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

import javalanguageplayground.beans.Country;
import javalanguageplayground.manager.CountryManager;
import javalanguageplayground.manager.impl.ACountryManager;

public class StreamTest {

	private CountryManager countryManager = new ACountryManager();

	@Test
	public void testFilter() {
		countryManager.getAll().stream().filter(f -> f.getPopulation() >= 60_000_000).forEach(System.out::println);
	}

	@Test
	public void testMap() {
		countryManager.getAll().stream().map(Country::getName).forEach(System.out::println);
	}

	@Test
	public void testRange() {
		IntStream.range(1, 11).forEach(System.out::println);
	}
	
	@Test
	public void testSkip() {
		System.out.println(IntStream.range(1, 5).skip(3).min().getAsInt());
	}

}
