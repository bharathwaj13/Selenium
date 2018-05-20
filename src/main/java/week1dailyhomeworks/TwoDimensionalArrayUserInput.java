package week1dailyhomeworks;
import java.util.Scanner;
public class TwoDimensionalArrayUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number of Rows of the 2D Matrix: ");
		int rowSize=scan.nextInt();
		System.out.print("Enter the Number of Columns of the 2D Matrix: ");
		int columnSize=scan.nextInt();
		int[][] myArray=new int[rowSize][columnSize];
		
		for(int i=0;i<rowSize;i++)
		{
			System.out.println("Enter the values for row "+(i+1)+":");
			for(int j=0;j<columnSize;j++)
			{
				myArray[i][j]=scan.nextInt();
			}
		}
		System.out.println("The Entered numbers are:");
		for (int i=0;i<rowSize;i++)
		{
			for (int j=0;j<columnSize;j++)
			{
				System.out.print(myArray[i][j]+" ");
			}
			System.out.println("");
		}
		scan.close();
	}

}
