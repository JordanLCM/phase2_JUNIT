package phase2_JUNIT_Package;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

public class phase2_JUNIT006 {

	@ParameterizedTest
	@ArgumentsSource(phase2_JUNIT005.class)
	public void atestArgSource(String argument) {
		System.out.println(argument);
	}
}
