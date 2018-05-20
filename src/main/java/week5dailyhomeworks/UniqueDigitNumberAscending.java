package week5dailyhomeworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UniqueDigitNumberAscending {

	public static void main(String[] args) {
		System.out.println("Enter any number: ");
		Scanner scan=new Scanner(System.in);
		int givenNumber=scan.nextInt();
		scan.close();
		int quotient=0;
		String result="";
		Set<Integer> uniqueDigits=new TreeSet<Integer>();
		do
		{
			int reminder=givenNumber%10;
			quotient=givenNumber/10;
			givenNumber=quotient;
			uniqueDigits.add(reminder);
		}while(quotient>0);
		List<Integer> finalNumber=new ArrayList<Integer>();
		finalNumber.addAll(uniqueDigits);
		for(int i=0;i<finalNumber.size();i++)
		{
			result=result+Integer.toString(finalNumber.get(i));
		}
		System.out.println("The number with unique Digits in Ascending order is: "+result);
	}

}
