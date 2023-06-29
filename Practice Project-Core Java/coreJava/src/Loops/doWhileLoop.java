package Loops;

import java.util.Scanner;

public class doWhileLoop {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value : ");
		int n = sc.nextInt();
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i <= n);
		
		sc.close();

	}

}
