package week1day1;

public class Palindrome {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNumber=121;
		int copyInputNumber=inputNumber;
		int reverseNumber=0;
		while(inputNumber>0)
		{
			
			int Reminder=inputNumber%10;
			int Quotient=inputNumber/10;
			reverseNumber=(reverseNumber*10)+Reminder;
			inputNumber=Quotient;
		}
		if (copyInputNumber==reverseNumber)
		{
			System.out.println("The given number is a palindrome");
		}
		else
		{
			System.out.println("The given number is not a palindrome");
		}
	}

}
