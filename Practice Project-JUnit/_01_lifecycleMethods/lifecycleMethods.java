package practiceProjects;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class lifecycleMethods {

	@BeforeAll
	public static void setUp() {
		System.out.println("Hello");
	}
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	
	@AfterAll
	public static void tearDown() {
		System.out.println("Bye Bye");
	}
}
