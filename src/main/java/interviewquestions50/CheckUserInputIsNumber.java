package interviewquestions50;

import java.util.Scanner;

public class CheckUserInputIsNumber {

	public static void main(String[] args) {
		System.out.print("Enter any number: ");
		Scanner scan=new Scanner(System.in);
		String string = scan.next();
		scan.close();
		//ASCII range of numbers 48 to 57
		if(checkNumber(string))
			System.out.println("The entry is a valid number");
		else
			System.out.println("The entry is not a valid number");
	}

	public static boolean checkNumber(String number) {
		try {
			Integer.parseInt(number);
		}
		catch(NumberFormatException e){
			return false;
		}
		return true;
	}

}
