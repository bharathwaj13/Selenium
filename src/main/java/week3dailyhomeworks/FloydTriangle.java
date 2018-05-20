package week3dailyhomeworks;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		System.out.print("Enter any number: ");
		Scanner scan=new Scanner(System.in);
		int givenNumber = scan.nextInt();
		scan.close();
		int printNumber=1;
		for(int i=1;i<=givenNumber;i++)
		{
			int counter=1;
			while(counter<=i)
			{
				System.out.print(printNumber+" ");
				printNumber++;
				counter++;
			}
			System.out.println("");
		}

	}

}
