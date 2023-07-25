package practiceProjects;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@ExcludeTags("production")
public class excludeTags {

	@Test
	@Tag("development")
	@Tag("production")
	public void test1() {
		
	}
	
	@Test
	@Tag("production")
	public void test2() {
		
	}
	

	@Test
	@Tag("development")
	public void test3() {
		
	}
}
