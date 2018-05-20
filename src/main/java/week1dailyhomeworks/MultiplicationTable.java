package week1dailyhomeworks;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a Number:");
		Scanner scan=new Scanner(System.in);
		int givenNumber=scan.nextInt();
		scan.close();
		if(givenNumber>0 && givenNumber<=10)
		{
			System.out.println("The Multiplication Table for "+givenNumber+" is");
			for(int i=1;i<=10;i++)
			{

				int product=givenNumber*i;
				System.out.println(givenNumber+" * "+i+" = "+product);
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}

}
