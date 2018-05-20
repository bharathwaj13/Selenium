package week7dailyhomeworks;

import java.util.Scanner;

public class FindDigitCountInString {

	public static void main(String[] args) {
		System.out.print("Enter a String: ");
		Scanner scan=new Scanner(System.in);
		String input=scan.next();
		scan.close();
		int counter=0;
		for(int i=0;i<input.length();i++)
		{
			if (Character.isDigit(input.charAt(i)))
				counter++;
		}
		if (counter==5)
			System.out.println("True The given String has exactly 5 digits in it");
		else
			System.out.println("False The given string does not exactly have 5 digits in it");
	}

}
