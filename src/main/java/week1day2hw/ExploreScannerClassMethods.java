package week1day2hw;

import java.util.Scanner;

public class ExploreScannerClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer
		System.out.print("Enter an integer: ");
		Scanner scan=new Scanner(System.in);
		int output=scan.nextInt();
		System.out.println("Entered value is :"+output);
		//Float
		System.out.print("Enter a float value: ");
		float floatOutput=scan.nextFloat();
		System.out.println("Entered value is :"+floatOutput);
		//Double
		System.out.print("Enter a double value: ");
		double doubleOutput=scan.nextDouble();
		System.out.println("Entered value is :"+doubleOutput);
		//String
		System.out.print("Enter a string value: ");
		String stringOutput=scan.next();
		System.out.println("Entered value is :"+stringOutput);
		//Character
		System.out.print("Enter a character value: ");
		String charOutput=scan.next();
		System.out.println("Entered value is :"+charOutput.charAt(0));
		scan.close();
		

	}

}
