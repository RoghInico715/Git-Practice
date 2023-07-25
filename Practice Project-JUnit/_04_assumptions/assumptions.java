package practiceProjects;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class assumptions {

	@Test
	public void test1() {
		assertTrue("abc".contains("z"));
		System.out.println("Test1");
	}
	
	@Test
	public void test2() {
		Assumptions.assumeTrue("abc".contains("z"));
		System.out.println("Test1");
	}
	
	@Test
	public void test3() {
		Assumptions.assumingThat("abc".contains("z"), ()-> {
			System.out.println("Test1");
		});
	}
}
