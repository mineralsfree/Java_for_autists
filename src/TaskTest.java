import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import org.junit.jupiter.api.Test;

class TaskTest {

	@Test
	void getFileNormalTest() {
		String answer = "filename.txt";
		final String[] testArgs = {answer};
		String fileName = Task1.getFileName(testArgs);
		assertEquals(answer, fileName);
	}
	
	@Test
	void getFileMoreArrItemsTest() {
		String answer = "filename.txt";
		final String[] testArgs = {answer, "kek", "lol", "TouchSosft", "Cool"};
		String fileName = Task1.getFileName(testArgs);
		assertEquals(answer, fileName);
	}
	
	@Test 
	void getEmployeeArrTest() throws IOException {
		int[] answersIn = {480, 560, 660, 600, 620, 630};
		Employee[] arr = Task1.getEmployeesArr("emp1.txt");

		for(int i = 0; i < arr.length; i++) {
			assertEquals(answersIn[i], arr[i].getIn());
		}
	}

	@Test 
	void getEmployeeArrWithEmptyFileTest() throws IOException {
		int answer_length = 0;
		Employee[] arr = Task1.getEmployeesArr("emp2.txt");

		assertEquals(answer_length, arr.length);
	}
	
	@Test 
	void getMaxEmployeesSimultaneouslyTest1() {
		final int answer = 1;
		
		Employee[] employeeArr = new Employee[2];
		employeeArr[0] = new Employee(100, 200);
		employeeArr[1] = new Employee(400, 800);
		int max = Task1.getMaxEmployeesSimultaneously(employeeArr);
		
		assertEquals(max, answer);
	}
	
	@Test
	void getMaxEmployeesSimultaneouslyTest2() {
		final int answer = 2;
		
		Employee[] employeeArr = new Employee[2];
		employeeArr[0] = new Employee(100, 200);
		employeeArr[1] = new Employee(100, 200);
		int max = Task1.getMaxEmployeesSimultaneously(employeeArr);
		
		assertEquals(max, answer);
	}
	
	@Test
	void getMaxEmployeesSimultaneouslyTest3() {
		final int answer = 2;
		
		Employee[] employeeArr = new Employee[2];
		employeeArr[0] = new Employee(100, 200);
		employeeArr[1] = new Employee(200, 300);
		int max = Task1.getMaxEmployeesSimultaneously(employeeArr);
		
		assertEquals(max, answer);
	}
	
	@Test
	void getMaxEmployeesSimultaneouslyTestEmpty() {
		final int answer = 0;
		
		Employee[] employeeArr = new Employee[0];
		int max = Task1.getMaxEmployeesSimultaneously(employeeArr);
		
		assertEquals(max, answer);
	}

	@Test 
	void finalTest() throws IOException {
		final int answer = 4;
		String filename = "times.txt";	    	
    	Employee[] employeesArr = Task1.getEmployeesArr(filename);
    	int maxAtTime = Task1.getMaxEmployeesSimultaneously(employeesArr);
    	
    	assertEquals(maxAtTime, answer);		
	}
}
