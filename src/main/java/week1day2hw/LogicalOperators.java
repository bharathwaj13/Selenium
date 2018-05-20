package week1day2hw;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the given number: ");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		System.out.print("Enter the given number: ");
		int number1=scan.nextInt();
		scan.close();
		/*if (number>0 && number%2==0)
		{
			System.out.println("The given number is an even positive number");
		}
		else
		{
			System.out.println("The given number is not even positive");
		}*/
		int result=number^number1;
		System.out.println(result);
	}

}
