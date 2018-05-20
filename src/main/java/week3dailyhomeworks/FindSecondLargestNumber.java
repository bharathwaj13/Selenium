package week3dailyhomeworks;

import java.util.Scanner;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of elements in array: ");
		Scanner scan=new Scanner(System.in);
		int arraySize = scan.nextInt();
		int[] numbers=new int[arraySize];
		int max=0;
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<arraySize;i++)
		{
			numbers[i]=scan.nextInt();
		}
		scan.close();
		for(int i=0;i<arraySize-1;i++)
		{
			for(int j=i+1;j<arraySize;j++)
			{
				if(numbers[i]>numbers[j])
				{
					max=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=max;
				}
			}
		}
		System.out.println("The Second Largest number in the Array is: "+numbers[arraySize-2]);
	}

}
