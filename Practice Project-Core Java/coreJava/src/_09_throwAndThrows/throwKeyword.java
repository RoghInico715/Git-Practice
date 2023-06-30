package _09_throwAndThrows;

import java.util.Scanner;

public class throwKeyword {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter Today :");
		String day = sc.nextLine();
		
		if (day.toLowerCase().equals("monday")) {
			throw new NullPointerException();
		}
		else {
			System.out.println("Weekend is approaching");
		}

	}

}
