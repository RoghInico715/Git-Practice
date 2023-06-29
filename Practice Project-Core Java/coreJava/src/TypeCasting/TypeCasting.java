package TypeCasting;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Implicit TypeCasting
		int num1;
		double num2;
		System.out.println("Implicit TyprCasting");
		System.out.println("Enter a Integer value: ");
		num1 = sc.nextInt();
		num2 = num1;
		System.out.println("Value of num1 : "+num1);
		System.out.println("Value of num2 : "+num2);
		
		//Explicit TypeCasting
		double num3;
		int num4;
		System.out.println("Explicit TyprCasting");
		System.out.println("Enter a Decimal value: ");
		num3 = sc.nextDouble();
		num4 = (int)num3;
		System.out.println("Value of num3 : "+num3);
		System.out.println("Value of num4 : "+num4);
		
		sc.close();

	}

}
