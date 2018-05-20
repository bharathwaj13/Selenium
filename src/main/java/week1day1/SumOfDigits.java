package week1day1;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNumber=1234;
		int copyInputNumber=inputNumber;
		int sumOfDigits=0;
		while (inputNumber>0)
		{
			int Quotient=inputNumber/10;
			int Reminder=inputNumber%10;
			sumOfDigits=sumOfDigits+Reminder;
			inputNumber=Quotient;
		}
		System.out.println("Sum of Digits in "+copyInputNumber+" is "+sumOfDigits);
	}

}
