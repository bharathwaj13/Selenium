package week4dailyhomeworks;

import java.util.Scanner;

public class CheckValidPassword1 {

	public static void main(String[] args) {
		System.out.print("Enter the password: ");
		Scanner scan =new Scanner(System.in);
		String givenPassword = scan.next();
		scan.close();
		int length = givenPassword.length();
		int countLetters=0,countDigits=0;
		boolean minCharFlag=false,lettersDigitsFlag=false,twoLettersDigitsFlag=false,capitalLetterFlag=false;
		if(length>9)
			minCharFlag=true;



		for(int i=0;i<length;i++)
		{
			//To find Existence of Letters and Digits only
			if(!Character.isLetterOrDigit(givenPassword.charAt(i)))
			{
				lettersDigitsFlag=true;
				break;
			}
			
			if(Character.isLetter(givenPassword.charAt(i)))

				countLetters++;

			else if(Character.isDigit(givenPassword.charAt(i)))

				countDigits++;
			
			//To Find Capital Letter Existence
			
			if(Character.isUpperCase(givenPassword.charAt(i)))
			{
				capitalLetterFlag=true;
				break;
			}

		}
		
		//Flag based on letters and Digits Count
		
		if(countLetters>=2 && countDigits>=2)
			twoLettersDigitsFlag=true;




		// Final Check

		if(minCharFlag && !lettersDigitsFlag && twoLettersDigitsFlag && capitalLetterFlag)
			System.out.println("The entered Password is valid");
		else
			System.out.println("The entered Password is invalid");
	}

}


