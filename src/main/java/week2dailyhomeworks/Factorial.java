package week2dailyhomeworks;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givenNumber;
		Scanner scan=new Scanner(System.in);
		do
		{
			System.out.print("Enter a number to find Factorial: ");
			givenNumber = scan.nextInt();
		}while(givenNumber<=1);
		int i=givenNumber;
		int product=1;
		for(int j=i-1;j>=1;j--)
		{
			product=i*j;
			i=product;
		}
		for(i=givenNumber;i>=1;i--)
		{
			if(i!=1)
				System.out.print(i+"*");
			else
				System.out.print(i+" is "+product);
		}
		scan.close();
	}

}
