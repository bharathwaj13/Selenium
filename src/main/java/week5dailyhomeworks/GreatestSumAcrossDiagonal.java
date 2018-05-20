package week5dailyhomeworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreatestSumAcrossDiagonal {

	public static void main(String[] args) {
		System.out.print("Enter the number of rows in the matrix: ");
		Scanner scan=new Scanner(System.in);
		int rowCount = scan.nextInt();
		System.out.print("Enter the number of columns in the matrix: ");
		int colCount = scan.nextInt();
		int rowCounter=0,colCounter=colCount;
		int sumUpper=0,sumLower=0;
		int[][] givenMatrix=new int[rowCount][colCount];
		List<Integer> upperTriangle=new ArrayList<Integer>();
		List<Integer> lowerTriangle=new ArrayList<Integer>();
		for(int i=0;i<rowCount;i++)
		{
			System.out.println("Enter the elements of row "+(i+1)+": ");
			for(int j=0;j<colCount;j++)
			{
				givenMatrix[i][j]=scan.nextInt();
			}
		}
		scan.close();
		System.out.println("The entered Matrix is: ");
		for(int i=0;i<rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				System.out.print(givenMatrix[i][j]+" ");
			}
			System.out.println("");
		}
		while(rowCounter<rowCount&&colCounter>1)
		{
			for(int i=0;i<colCounter-1;i++)
			{
				upperTriangle.add(givenMatrix[rowCounter][i]);
				sumUpper=sumUpper+givenMatrix[rowCounter][i];
			}
			rowCounter++;
			colCounter--;
		}
		System.out.println("Sum of Upper triangle is: "+sumUpper);
		rowCounter=rowCount-1;
		colCounter=1;
		while(colCounter<colCount&&rowCounter>0)
		{
			for(int i=colCounter;i<colCount;i++)
			{
				lowerTriangle.add(givenMatrix[rowCounter][i]);
				sumLower=sumLower+givenMatrix[rowCounter][i];
			}
			rowCounter--;
			colCounter++;
		}
		System.out.println("Sum of Lower triangle is :"+sumLower);
		if(sumLower>sumUpper)
		{
			System.out.print("Lower Triangle is: ");
			for(int i=0;i<lowerTriangle.size();i++)
				System.out.print(lowerTriangle.get(i)+" ");
		}
		else
		{
			System.out.print("Upper Triangle is: ");
			for(int i=0;i<upperTriangle.size();i++)
				System.out.print(upperTriangle.get(i)+" ");
		}
	}

}
