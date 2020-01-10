package javalanguageplayground.version12;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

public class SwitchExpressionsTest {

	@Test
	public void testBeforeJava12() {

		DayOfWeek dayOfWeek = LocalDateTime.now().getDayOfWeek();
		// DayOfWeek dayOfWeek =
		// LocalDateTime.now().plus(Duration.ofDays(1)).getDayOfWeek();

		switch (dayOfWeek) {
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		case FRIDAY:
			System.out.println("Working day :(");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekend :)");
			break;
		}

	}

	@Test
	public void testFromJava12Preview() {

		DayOfWeek dayOfWeek = LocalDateTime.now().getDayOfWeek();
		// DayOfWeek dayOfWeek =
		// LocalDateTime.now().plus(Duration.ofDays(1)).getDayOfWeek();

		System.out.println(switch (dayOfWeek) {
		case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Working day :(";
		case SATURDAY, SUNDAY -> "Weekend :)";
		});

	}

}
