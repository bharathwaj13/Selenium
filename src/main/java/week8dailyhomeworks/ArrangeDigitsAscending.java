package week8dailyhomeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrangeDigitsAscending {

	public static void main(String[] args) {
		System.out.print("Enter any number: ");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		int quotient=0;
		scan.close();
		List<Integer> ascending=new ArrayList<Integer>();
		do {
			int reminder=number%10;
			quotient=number/10;
			ascending.add(reminder);
			number=quotient;
		}while(quotient!=0);
		Collections.sort(ascending);
		for(int i=0;i<ascending.size();i++)
		{
			System.out.print(ascending.get(i));
		}
	}

}
