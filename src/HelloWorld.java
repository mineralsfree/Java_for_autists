
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;
@SuppressWarnings("rawtypes")

class HelloWorld {
	    public static void main(String[] av) throws Exception {
	    	File file = new File("src/times.txt");
	    	int countlines = countLines("src/times.txt");
	    	byte[] daySeconds = new byte[60*24];
	    	Employee[] eArr = new Employee[countlines];
	    	Scanner sc =new Scanner(file);
	    	
	    	//sc.useDelimiter(":");
	    	int i = 0;
	    	while (sc.hasNextLine()) {
	    	//System.out.println(sc.next());
	    	String inTimeString = new String(sc.next());
	    	String outTimeString = new String(sc.nextLine().trim());
	    	
	    	String[] inparts = inTimeString.split(":");
	    	String[] outparts = outTimeString.split(":");
	    	Employee vasya = new Employee((Integer.parseInt(inparts[0]))*60+Integer.parseInt(inparts[1]),
	    		(Integer.parseInt(outparts[0]))*60+Integer.parseInt(outparts[1]));	    	 
	    	eArr[i] = vasya;
	    	System.out.println(vasya.getIn());
	    //	Arrays.sort(eArr);
	        
	    
	    	 i++;	 
	    	}
	    	
	    	int maxAtTime = 0;
	    	
	    	sc.close();
	    	for (Employee vasya: eArr) {
	    		for (int j = vasya.getIn(); j <= vasya.getOut(); j++) {
					daySeconds[j]++;
					if (daySeconds[j]>maxAtTime){
					maxAtTime = daySeconds[j];
					}
				}
	    	}
	    	System.out.println(maxAtTime);

	    }

		private static int countLines(String filename) throws IOException {
			 InputStream is = new BufferedInputStream(new FileInputStream(filename));
			    try {
			        byte[] c = new byte[1024];
			        int count = 0;
			        int readChars = 0;
			        boolean empty = true;
			        while ((readChars = is.read(c)) != -1) {
			            empty = false;
			            for (int i = 0; i < readChars; ++i) {
			                if (c[i] == '\n') {
			                    ++count;
			                }
			            }
			        }
			        return (count == 0 && !empty) ? 1 : count;
			    } finally {
			        is.close();
			    }
		}
	

}