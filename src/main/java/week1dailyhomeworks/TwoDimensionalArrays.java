package week1dailyhomeworks;
import java.util.Scanner;
public class TwoDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myArray=new int[3][4];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers for the first row");
		for(int i=0;i<4;i++)
		{
			myArray[0][i]=scan.nextInt();
		}
		System.out.println("Enter the numbers for the second row");
		for(int i=0;i<4;i++)
		{
			myArray[1][i]=scan.nextInt();
		}
		System.out.println("Enter the numbers for the third row");
		for(int i=0;i<4;i++)
		{
			myArray[2][i]=scan.nextInt();
		}
		System.out.println("The Entered numbers are:");
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<4;j++)
			{
				System.out.print(myArray[i][j]+" ");
			}
			System.out.println("");
		}
		scan.close();
	}

}
