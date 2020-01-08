package javalanguageplayground.version8;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

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

	@Test
	public void testDistinct() {
		IntStream intStream = new Random().ints(10, 1, 5);
		intStream.distinct().forEach(System.out::println);
	}

	@Test
	public void testGroupByInitial() {
		countryManager.getAll().stream().collect(Collectors.groupingBy(c -> c.getName().charAt(0))).forEach((i, l) -> {
			System.out.println("Countries beginning with " + i + ": " + l.toString());
		});
	}

	@Test
	public void testReduce() {
		System.out.println(countryManager.getAll().stream().reduce((c1, c2) ->
				new Country(null, "World", null, c1.getPopulation() + c2.getPopulation())));
	}

	@Test
	public void testParallelReduce() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			sumNonParallelStream();
			// sumParallelStream();
		}
		long stop = System.currentTimeMillis();
		System.out.println(String.format("%,d ms", stop - start));
	}

	private void sumNonParallelStream() {
		LongStream stream = LongStream.range(1, 1_000_000_000);
		System.out.println(stream.reduce((l1, l2) -> l1 + l2));
	}

	private void sumParallelStream() {
		LongStream stream = LongStream.range(1, 1_000_000_000);
		System.out.println(stream.parallel().reduce((l1, l2) -> l1 + l2));
	}

}