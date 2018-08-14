public class Employee implements Comparable<Employee> {
	
	private int in;
	private int out;
	public Employee(int in,int out) {
		this.in = in;
		this.out = out;
	}
	public int getIn() {
		return in;
	}
	public int getOut() {
		return out;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return in - ((Employee)o).in;
	}
}