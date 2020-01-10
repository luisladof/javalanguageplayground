package javalanguageplayground.version8;

import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class DateTimeTest {

	// Before Java8
	private DateFormat dateFormatLong = DateFormat.getDateInstance(DateFormat.LONG);
	private DateFormat dateTimeFormatLongShort = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT);
	private DateFormat timeFormatShort = DateFormat.getTimeInstance(DateFormat.SHORT);

	// Java8
	private DateTimeFormatter dateFormatterLong = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
	private DateTimeFormatter dateTimeFormatterLongShort = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG,
			FormatStyle.SHORT);
	private DateTimeFormatter timeFormatterShort = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
	private DateTimeFormatter dateTimeFormatterFullFull = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,
			FormatStyle.FULL);

	@Test
	public void testDateBeforeJava8() {
		Calendar now = Calendar.getInstance();
		now.setTime(new Date());
		System.out.println(dateFormatLong.format(now.getTime()));
		now.add(Calendar.DAY_OF_YEAR, 5);
		System.out.println(dateFormatLong.format(now.getTime()));
	}

	@Test
	public void testDateJava8() {
		LocalDate now = LocalDate.now();
		System.out.println(now.format(dateFormatterLong));
		LocalDate nowPlusFiveDays = now.plusDays(5);
		// Alternative
		// LocalDate nowPlusFiveDays = now.plus(Period.ofDays(5));
		System.out.println(now.format(dateFormatterLong));
		System.out.println(nowPlusFiveDays.format(dateFormatterLong));
	}

	@Test
	public void testDateTimeBeforeJava8() {
		Calendar now = Calendar.getInstance();
		now.setTime(new Date());
		System.out.println(dateTimeFormatLongShort.format(now.getTime()));
		now.add(Calendar.DAY_OF_YEAR, 5);
		now.add(Calendar.MINUTE, 10);
		System.out.println(dateTimeFormatLongShort.format(now.getTime()));
	}

	@Test
	public void testDateTimeJava8() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.format(dateTimeFormatterLongShort));
		LocalDateTime nowPlusFiveDaysTenMinutes = now.plusDays(5).plusMinutes(10);
		// Alternative
		// LocalDateTime nowPlusFiveDaysTenMinutes =
		// now.plus(Period.ofDays(5)).plus(Duration.ofMinutes(10));
		System.out.println(now.format(dateTimeFormatterLongShort));
		System.out.println(nowPlusFiveDaysTenMinutes.format(dateTimeFormatterLongShort));
	}

	@Test
	public void testTimeBeforeJava8() {
		Calendar now = Calendar.getInstance();
		now.setTime(new Date());
		System.out.println(timeFormatShort.format(now.getTime()));
		now.add(Calendar.HOUR, 3);
		System.out.println(timeFormatShort.format(now.getTime()));
	}

	@Test
	public void testTimeJava8() {
		LocalTime now = LocalTime.now();
		System.out.println(now.format(timeFormatterShort));
		LocalTime nowPlusThreeHours = now.plusHours(3);
		// Alternative
		// LocalDateTime nowPlusThreeHours = now.plus(Duration.ofHours(3));
		System.out.println(now.format(timeFormatterShort));
		System.out.println(nowPlusThreeHours.format(timeFormatterShort));
	}

	@Test
	public void testZonedDateTimeJava8() {
		ZonedDateTime nowHere = ZonedDateTime.now();
		System.out.println(nowHere.format(dateTimeFormatterFullFull));
		ZonedDateTime nowTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println(nowTokyo.format(dateTimeFormatterFullFull));
		LocalDateTime now = LocalDateTime.now();
		System.out.println(ZonedDateTime.of(now, ZoneId.of("America/Los_Angeles")).format(dateTimeFormatterFullFull));
	}

	@Test
	public void testConversion() {
		Calendar calendar = Calendar.getInstance();
		LocalDateTime now = LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault());
		System.out.println(now.format(dateTimeFormatterLongShort));
	}

}
