package week3dailyhomeworks;

import java.util.Scanner;

public class FindLeapYearOrNot {

	public static void main(String[] args) {
		System.out.print("Enter any Year: ");
		Scanner scan =new Scanner(System.in);
		int givenYear=scan.nextInt();
		scan.close();
		boolean blnflag4=false,blnflag100=false,blnflag400=false;
		if(givenYear%4==0)
		{
			blnflag4=true;
			if(givenYear%100==0)
			{
				blnflag100=true;
				if(givenYear%400==0)
				{
					blnflag400=true;
				}
			}
		}
		if(blnflag4&&!blnflag100 || blnflag4&&blnflag100&&blnflag400)
			System.out.println("The given year is a leap year");
		else
			System.out.println("The given year is not a leap year");

	}

}
