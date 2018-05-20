package week7dailyhomeworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.print("Enter any number: ");
		Scanner scan =new Scanner(System.in);
		int input=scan.nextInt();
		scan.close();
		int sum=0;
		List<Integer> positiveDivisors=new ArrayList<Integer>();
		for(int i=1;i<input;i++)
		{
			if(input%i==0)
				positiveDivisors.add(i);
		}
		for(int i=0;i<positiveDivisors.size();i++)
		{
			sum=sum+positiveDivisors.get(i);
		}
		if(sum==input)
			System.out.println("The given number is a perfect number");
		else
			System.out.println("The given number is not a perfect number");
	}

}
