package week6dailyhomeworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreeDigitCombinations {

	public static void main(String[] args) {
		System.out.print("Enter a 3 digit number: ");
		Scanner scan=new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		List<String> combinations=new ArrayList<String>();
		int[] digits=new int[3];
		for(int i=0;i<3;i++)
		{
			digits[i]=number%10;
			int quotient=number/10;
			number=quotient;
		}
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				for(int k=0;k<=2;k++)
				{
					if (checkDuplicates(i, j, k))
						combinations.add(Integer.toString(digits[i])+Integer.toString(digits[j])+Integer.toString(digits[k]));
				}
			}
		}
		System.out.println(combinations);
	}
	public static boolean checkDuplicates(int i,int j,int k) {
		if(i==j || j==k || i==k)
			return false;
		else
			return true;
	}

}


