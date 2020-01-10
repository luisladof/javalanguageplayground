package javalanguageplayground.scratchpad;

public class Foo {

	public static void main(final String[] args) {

		int j = 3;
		for (int i = 1; i <= 10; i++) {
			j *= i;
			assert (j & 1) != 1 : "j is not even";
		}
		
	}

}
