import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

class Calculator_Test {
	private Calculator calculator;
	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	@Test
	@DisplayName("Addition Test")
	void test() {
		int result = calculator.add(5,  3);
		assertEquals(result, 8, "\n~Add not working properly~\n");
	}
	@Test
	@DisplayName("Multiplication Test")
	void multiplicationTest() {
		int result = calculator.multiply(2, 3);
		assertEquals(result, 6, "\n~Multiplier not working properly~\n");
	}
	
}
