package phase2_JUNIT_Package;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.*;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class phase2_JUNIT_DynamicTest {

	@TestFactory
	Collection<DynamicTest> dynamicM() {
		return Arrays.asList(dynamicTest("TestM1", () -> assertTrue(1 < 4)),
				dynamicTest("TestM2", () -> System.out.println("Hello")),
				dynamicTest("TestM3", () -> assertEquals("He", "He")));
	}
}
