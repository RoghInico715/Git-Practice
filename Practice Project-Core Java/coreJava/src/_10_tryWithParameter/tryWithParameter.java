package _10_tryWithParameter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class tryWithParameter {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileOutputStream fileOutputStream = new FileOutputStream("E:\\Mphasis\\phase 1\\2)core java\\Practice Project-Core Java\\coreJava\\src\\_10_tryWithParameter\\Output.txt")){
			String msg = "Hello, Have a Nice Day...";
			//converting string into byte array  
			byte byteArray[] = msg.getBytes();    
			fileOutputStream.write(byteArray);  
			System.out.println("Code executed successfully");      
		}

	}

}
