package practiceProjects;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class argumentSourceCsv {

	@ParameterizedTest
	@CsvSource({"test, TEST", "monDAY, MONday", "July, july"})
	public void test1(String actual, String expected) {
		String actualValue = actual.toLowerCase();
		String expectedValue = expected.toLowerCase();
		assertEquals(actualValue, expectedValue);
	}
}
