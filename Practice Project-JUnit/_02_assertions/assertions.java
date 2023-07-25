package practiceProjects;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class assertions {

	@Test
	public void testAssertions() {
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";
		
		int val1 = 5;
		int val2 = 6;
		
		String[] expectedArray = {"one", "two", "three"};
		String[] resultArray = {"one", "two", "three"};
		
		//checking the two objects are equal
		assertEquals(str1, str2);
		
		//checking that a condition is true
		assertTrue(val1 < val2);
		
		//checking that a condition is false
		assertFalse(val1 > val2);
		
		//checking that a object is not null
		assertNotNull(str1);
		
		//checking that a object is not null
		assertNull(str3);
		
		//checking two objects reference point to the same object
		assertSame(str4, str5);
		
		//checking two objects reference do not point to the same object
		assertNotSame(str1, str2);
		
		//check is 2 arrays are equal
		assertArrayEquals(expectedArray, resultArray);
	}
}
