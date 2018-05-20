package week4dailyhomeworks;

import java.util.Scanner;

public class CheckValidPassword {

	public static void main(String[] args) {
		System.out.print("Enter the password: ");
		Scanner scan =new Scanner(System.in);
		String givenPassword = scan.next();
		int length = givenPassword.length();
		char[] charArray = givenPassword.toCharArray();
		int countLetters=0,countDigits=0;
		boolean minCharFlag=false,lettersDigitsFlag=false,twoLettersDigitsFlag=false,capitalLetterFlag=false;
		if(length>9)
			minCharFlag=true;
		
		//To find Existence of Letters and Digits only
		
		for(int i=0;i<length;i++)
		{
			if(!Character.isLetterOrDigit(givenPassword.charAt(i)))
			{
				lettersDigitsFlag=true;
				break;
			}
			
		}
		
		//To Find Count of Letters and Digits
		
		for(int i=0;i<length;i++)
		{
			if(Character.isLetter(givenPassword.charAt(i)))
		
				countLetters++;
	
			else if(Character.isDigit(givenPassword.charAt(i)))
			
				countDigits++;
			
			
		}
		if(countLetters>=2 && countDigits>=2)
			twoLettersDigitsFlag=true;
		
		//To Find Capital Letter Existence
		
		for(int i=0;i<length;i++)
		{
			if(Character.isUpperCase(givenPassword.charAt(i)))
			{
				capitalLetterFlag=true;
				break;
			}
		}
			
		// Final Check
		
		if(minCharFlag && !lettersDigitsFlag && twoLettersDigitsFlag && capitalLetterFlag)
			System.out.println("The entered Password is valid");
		else
			System.out.println("The entered Password is invalid");
	}

}
