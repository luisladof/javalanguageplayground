package javalanguageplayground.version7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

import javalanguageplayground.constants.Countries;

public class CatchTest {

	@Test
	public void testBeforeJava7() {

		String country = Countries.SOUTH_AFRICA;

		try {
			Class<?> clazz = Class.forName("java.lang.String");
			Method m = clazz.getMethod("toUpperCase");
			System.out.println(m.invoke(country));
		} catch (ClassNotFoundException e) {
			System.out.println("Class does not exist!");
		} catch (NoSuchMethodException e) {
			System.out.println("Method does not exist!");
		} catch (SecurityException e) {
			System.out.println("Access is denied!");
		} catch (IllegalAccessException e) {
			System.out.println("Method cannot be accessed!");
		} catch (IllegalArgumentException e) {
			System.out.println("Method cannot be invoked on this object!");
		} catch (InvocationTargetException e) {
			System.out.println("Invocation failed!");
		}

	}

	@Test
	public void testJava7() {

		String country = Countries.SOUTH_AFRICA;

		Class<?> clazz;
		try {
			clazz = Class.forName("java.lang.String");
			Method m = clazz.getMethod("toUpperCase");
			System.out.println(m.invoke(country));
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			System.out.println("Something bad happened!");
		}

	}

}
