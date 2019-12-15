package javalanguageplayground.version8;

import org.junit.jupiter.api.Test;

import javalanguageplayground.manager.CountryManager;
import javalanguageplayground.manager.impl.ACountryManager;

public class DefaultStaticInterfaceTest {

	private CountryManager countryManager = new ACountryManager();

	@Test
	public void testDefaultMethod() {
		System.out.println(countryManager.getName());
	}

	@Test
	public void testStaticMethod() {
		System.out.println(CountryManager.getKind());
	}

}
