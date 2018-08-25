public class Employee {
	
	private int timeIn;
	private int timeOut;
	public Employee(int in,int out) {
		this.timeIn = in;
		this.timeOut = out;
	}
	public int getIn() {
		return timeIn;
	}
	public int getOut() {
		return timeOut;
	}
}