package phase2_JUNIT_Package;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class phase2_JUNIT_Assertion {

	@Test
	public void testM0() {
		String str1 = "abc";
		String str2 = "def";
		int val1 = 5;
		int val2 = 6;
		String str3 = new String("abc");
		String str4 = new String("abc");
		String[] arr1 = {"Jo", "Lo", "Ho"};
		String[] arr2 = {"Jo", "Lo", "Ho"};
		String[] arr3 = {"Jordan", "Loki", "Hope"};
		
//		assertEquals(str1, str2);
		//str1 = str2 which is wrong
		
		assertEquals(str3, str4);
		//str3 = str4 which is correct
		
//		assertEquals(val1, val2);
		//val1 = val2 which is wrong
		
		assertTrue(val2 > val1);
		//val2 bigger than val1 which is correct
		
		assertFalse(val1 > val2);
		//val1 is NOT bigger than val2 which is correct
		
		assertArrayEquals(arr1, arr2);
		//array of texts in arr1 = arr2 which is correct
		
//		assertArrayEquals(arr1, arr3);
		//array of texts in arr1 = arr3 which is wrong
	}
	
}
