package javalanguageplayground.version05;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import javalanguageplayground.annotations.Printable;
import javalanguageplayground.beans.Item;
import javalanguageplayground.manager.ItemManager;

public class AnnotationTest {

	@Test
	public void test() {

		ItemManager itemManager = new ItemManager();
		List<Item> items = itemManager.getAll();

		for (Item item : items) {
			System.out.print("[ ");

			List<Field> allFields = new ArrayList<Field>();
			getAllFields(item.getClass(), allFields);
			for (Field field : allFields) {
				field.setAccessible(true);
				Printable printable = field.getAnnotation(Printable.class);
				if (printable != null) {
					try {
						switch (printable.style()) {
						case LOWERCASE:
							System.out.print(field.get(item).toString().toLowerCase());
							break;
						case UPPERCASE:
							System.out.print(field.get(item).toString().toUpperCase());
							break;
						case ORIGINAL:
							System.out.print(field.get(item).toString());
							break;
						}
					} catch (Exception e) {
						//
					}
				}
				System.out.print(" ");
			}
			System.out.println("]");
		}

	}

	private List<Field> getAllFields(Class<?> clazz, List<Field> allFields) {
		allFields.addAll(Arrays.asList(clazz.getDeclaredFields()));
		if (clazz.getSuperclass() != null) {
			getAllFields(clazz.getSuperclass(), allFields);
		}
		return allFields;
	}

}
