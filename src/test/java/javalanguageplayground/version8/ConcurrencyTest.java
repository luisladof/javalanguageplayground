package javalanguageplayground.version8;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import javalanguageplayground.beans.Country;
import javalanguageplayground.manager.CountryManager;
import javalanguageplayground.manager.impl.ACountryManager;
import javalanguageplayground.manager.impl.AnotherCountryManager;

public class ConcurrencyTest {

	private CountryManager aCountryManager = new ACountryManager();
	private CountryManager anotherCountryManager = new AnotherCountryManager();

	@Test
	public void test() {

		CompletableFuture<List<Country>> cf = CompletableFuture.supplyAsync(() -> aCountryManager.getAll())
				.thenCombine(CompletableFuture.supplyAsync(() -> anotherCountryManager.getAll()), (list1, list2) -> Stream
						.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList()));

		try {
			cf.get().forEach(System.out::println);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
