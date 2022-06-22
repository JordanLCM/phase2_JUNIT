package phase2_JUNIT_Package;

import static org.junit.jupiter.api.Assumptions.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

public class phase2_JUNIT003 {

	@Test
	public void testAssumption() {
		int a = 10;
//		assumeTrue(a < 5);
		// assumed 10 (is smaller than)< 5 which will fail
		assumeFalse(a > 5);
		// assumed 10 >(is not bigger than) 5 which will fail
		System.out.println("Assumed correct");
	}

	@RepeatedTest(5)
	public void repeat() {
		System.out.println("Repeat");
		int a = 2;
		assertEquals(2, a);
		System.out.println(a);
	}
}
