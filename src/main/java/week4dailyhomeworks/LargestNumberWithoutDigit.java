package week4dailyhomeworks;

import java.util.Scanner;

public class LargestNumberWithoutDigit {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int givenNumber=scan.nextInt();
		int copyNumber=givenNumber;
		System.out.println("Enter a digit: ");
		int givenDigit=scan.nextInt();
		int quotient=0;
		int i=0;
		boolean flag=false;
		for(i=givenNumber-1;i>0;i--)
		{
			flag=false;
			givenNumber=i;
			do
			{
				int reminder=givenNumber%10;
				quotient=givenNumber/10;
				if(reminder==givenDigit)
				{
					flag=true;
					break;
				}
				givenNumber=quotient;
			}while(quotient>0);
			if(!flag)
				break;
		}
		if(!flag)
			System.out.println("The largest number below "+copyNumber+" without containing the digit "+givenDigit+" is "+i);
		else
			System.out.println("There is no positive number below "+copyNumber+" without containing the digit "+givenDigit);

	}
}
