package week2dailyhomeworks;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Name: ");
		Scanner scan=new Scanner(System.in);
		String givenName = scan.next();
		scan.close();
		int stringLength=givenName.length();
//		int j=stringLength;
		String reverseString="";
//		char[] reverseArray=new char[stringLength];
		for(int i=stringLength-1;i>=0;i--)
		{
			
//			reverseArray=givenName.toCharArray();
//			reverseArray[i]=givenName.charAt(j);
			reverseString=reverseString+givenName.charAt(i);
		}
//		System.out.println(reverseString);
		if(givenName.equalsIgnoreCase(reverseString))
			System.out.println("The given Name is a Palindrome");
		else
			System.out.println("The given Name is not a Palindrome");
	}

}
