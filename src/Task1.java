
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
class Task1 {
	
		public static String getFileName(String[] args) {
			String filename;
	    	try {
	    		filename = args[0];
	    	} catch (ArrayIndexOutOfBoundsException e) {
	    		filename = "times.txt";
	    	}
	    	
			return filename;
		}
		
		public static Employee[] getEmployeesArr(String filename) throws IOException {
			File file = new File(filename); // Открываем файл
	    	int countlines = CountLines.countLines(filename); // Получаем количество строк файла
	    
	    	
	    	Employee[] eArr = new Employee[countlines];
	    	Scanner sc =new Scanner(file);

	    	int i = 0;
	    	while (sc.hasNextLine()) {

	    	String inTimeString = new String(sc.next());
	    	String outTimeString = new String(sc.nextLine().trim());
	    	
	    	String[] inparts = inTimeString.split(":");
	    	String[] outparts = outTimeString.split(":");
	    	eArr[i] = new Employee((Integer.parseInt(inparts[0]))*60+Integer.parseInt(inparts[1]),
	    		(Integer.parseInt(outparts[0]))*60+Integer.parseInt(outparts[1]));	    	 
		    	
	    	 i++;
	    	}
	    	sc.close();
	    	return eArr;
		}
		public static int getMaxEmployeesSimultaneously (Employee[] employeesArr) {
			byte[] daySeconds = new byte[60*24];
	    	int maxAtTime = 0;
	    	
			for (Employee vasya: employeesArr) {
	    		for (int j = vasya.getIn(); j <= vasya.getOut(); j++) {
					daySeconds[j]++;
					if (daySeconds[j]>maxAtTime){
					maxAtTime = daySeconds[j];
					}
				}
	    	}
			return maxAtTime;
		}
		
	    public static void main(String[] args) throws Exception {
	    	
	    	String filename = getFileName(args);	    	
	    	Employee[] employeesArr = getEmployeesArr(filename);
	    	int maxAtTime = getMaxEmployeesSimultaneously(employeesArr);
	    	
	    	System.out.println(maxAtTime);

	    }

	

}