package phase2_JUNIT_Package;

import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class phase2_JUNIT001 {

	@Test
	public void testM0() {
		System.out.println("Hello Junit 5 test");
	}

	@Test
	public void testM1() {
		System.out.println("Hello Junit 5 test 2");
	}

	@BeforeClass
	public void testBC() {
		System.out.println("Before class");
	}

	@BeforeEach
	public void testBE() {
		System.out.println("Before each tests");
	}

	@BeforeAll
	public static void testAll() {
		System.out.println("Before all");
	}

	@AfterAll
	public static void testAAll() {
		System.out.println("After all");
	}
}
