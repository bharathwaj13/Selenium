package week3dailyhomeworks;

import java.util.Scanner;

public class FindSecondLargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of elements in array: ");
		Scanner scan=new Scanner(System.in);
		int arraySize = scan.nextInt();
		int[] numbers=new int[arraySize];
		int[] descendingNumbers=new int[arraySize];
		int h=0;
		boolean flag=false;
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<arraySize;i++)
		{
			numbers[i]=scan.nextInt();
		}
		for(int i=0;i<arraySize;i++)
		{
			if(i==arraySize)
			{
				descendingNumbers[h]=numbers[i];
			}
			else
			{
				flag=false;
				for(int j=i+1;j<arraySize;j++)
				{
					if(numbers[i]<numbers[j])
					{
						flag=true;
						break;
					}
				}
				if(!flag)
				{
					descendingNumbers[h]=numbers[i];
					h++;
					if(i==arraySize-1)
					{
						numbers[i]=0;
					}
					{
						for(int k=i+1;k<arraySize;k++)
						{
							numbers[k-1]=numbers[k];
						}
					}
				}
			}
		}
		System.out.println(descendingNumbers[1]);
	}

}
