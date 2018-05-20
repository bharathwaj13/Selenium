package week5dailyhomeworks;

import java.util.Scanner;

public class NumberReverse_Recursion {

	public static void main(String[] args) {
		int num=0;
		System.out.println("Input your number and press enter: ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		scan.close();
		System.out.print("Reverse of the input number is:");
		reverseNumber(num);
		System.out.println();

	}
	public static void reverseNumber(int number) {
		if (number < 10) {
			System.out.println(number);
			return;
		}
		else {
			System.out.print(number % 10);
			reverseNumber(number/10);
		}
	}

}
