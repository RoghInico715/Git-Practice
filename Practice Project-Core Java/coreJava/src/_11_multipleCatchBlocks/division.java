package _11_multipleCatchBlocks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class division {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//try block
		try {
			System.out.println("Enter a number : ");
			int num1 = sc.nextInt();
			System.out.println("Enter a another number : ");
			int num2 = sc.nextInt();
			System.out.println("Result of division = " + (num1/num2));
		}
		//catch block 1
		catch (ArithmeticException e){
			//Action to be taken in case an exception occurs
			System.out.println("Please do not enter a zero in the denominator");
		}
		//catch block 2
		catch (InputMismatchException e){
			System.out.println("Only integer values are allowed");
		}
		//catch block 3
		catch (Exception e){
			System.out.println("Please enter a Valid Input");
		}
	}

}
