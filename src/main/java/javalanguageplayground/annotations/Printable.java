package javalanguageplayground.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javalanguageplayground.enumeration.Style;

@Retention(RUNTIME)
@Target(FIELD)
public @interface Printable {

	Style style() default Style.ORIGINAL;

}
