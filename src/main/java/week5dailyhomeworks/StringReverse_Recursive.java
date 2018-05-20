package week5dailyhomeworks;

import java.util.Scanner;

public class StringReverse_Recursive {
	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner scan=new Scanner(System.in);
		String inputString = scan.next();
		scan.close();
		reverse(inputString);
	}
	public static void reverse(String input) {
		if (input.length()==1)
		{
			System.out.print(input);
			return;
		}
		//Calling Function Recursively
		//        return reverse(input.substring(1)) + input.charAt(0);
		else
		{
			System.out.print(input.charAt(input.length()-1));
			reverse(input.substring(0,input.length()-1));
		}
	}

}
