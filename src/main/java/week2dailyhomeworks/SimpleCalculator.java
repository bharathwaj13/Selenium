package week2dailyhomeworks;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=0;
		System.out.print("Enter the first number: ");
		Scanner scan =new Scanner(System.in);
		int firstNumber = scan.nextInt();
		System.out.print("Enter the second number: ");
		int secondNumber = scan.nextInt();
		System.out.println("Enter the operation type: ");
		String operationType=scan.next();
		scan.close();
		if(operationType.equalsIgnoreCase("Add"))
			result=firstNumber+secondNumber;
		else if(operationType.equalsIgnoreCase("Subtract"))
			result=firstNumber-secondNumber;
		else if(operationType.equalsIgnoreCase("Multiply"))
			result=firstNumber*secondNumber;
		else if(operationType.equalsIgnoreCase("Divide"))
			result=firstNumber/secondNumber;
		/*else if(operationType.equalsIgnoreCase("Modulus"))
			result=firstNumber%secondNumber;*/
		else
			System.out.println("Invalid Entry");
		System.out.println("Result: "+result);
	}

}
