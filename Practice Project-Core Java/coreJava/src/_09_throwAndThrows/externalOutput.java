package _09_throwAndThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URI;

public class externalOutput {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("E:\\Mphasis\\phase 1\\2)core java\\Practice Project-Core Java\\coreJava\\src\\_09_throwAndThrows\\Output.txt");

		PrintWriter printWriter = new PrintWriter(file);
		printWriter.print("Hello, Have a Nice Day...");
		
		printWriter.close();
	}

}
