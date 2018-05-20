package week1dailyhomeworks;
import java.util.Scanner;
public class UnderstandingOneDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 4 numbers: ");
		int[] arrayNumbers = new int[4];
		for(int i=0;i<=3;i++)
		{
			Scanner scan=new Scanner(System.in);
			arrayNumbers[i]=scan.nextInt();

		}
		System.out.println("The entered numbers are :");
		for(int j=0;j<arrayNumbers.length;j++)
		{
			System.out.println(arrayNumbers[j]+" ");
		}
	}

}
