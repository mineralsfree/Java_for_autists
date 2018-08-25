import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void constructorTest() {
		final int in = 2;
		final int out = 4;
		Employee employee = new Employee(in, out);
		assertEquals(in, employee.getIn());
		assertEquals(out, employee.getOut());
	}

}
