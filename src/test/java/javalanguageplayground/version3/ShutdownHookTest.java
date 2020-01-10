package javalanguageplayground.version3;

import org.junit.jupiter.api.Test;

public class ShutdownHookTest {

	@Test
	public void test() {

		Runtime.getRuntime().addShutdownHook(new Thread() {

			public void run() {
				System.out.println("Shutting down JVM...");
			}
		});

		System.exit(0);

	}

}
