package week2dailyhomeworks;

import java.util.Scanner;

public class OutputBasedOnDivisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the First Number: ");
		Scanner scan=new Scanner(System.in);
		int firstNumber = scan.nextInt();
		System.out.print("Enter the Second Number: ");
		int secondNumber = scan.nextInt();
		scan.close();
		if(firstNumber>secondNumber)
		{
			int tempNumber=firstNumber;
			firstNumber=secondNumber;
			secondNumber=tempNumber;
		}
		for(int i=firstNumber;i<=secondNumber;i++)
		{
			if(i%3==0&&i%5==0)
				System.out.println("FIZZBUZZ");
			else if(i%3==0)
				System.out.println("FIZZ");
			else if(i%5==0)
				System.out.println("BUZZ");
			else
				System.out.println(i);
		}
	}

}
