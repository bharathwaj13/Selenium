package week3dailyhomeworks;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] allNumbers= {1,3,4,89,65,45,98,41,209,432,1,3,3,45,45,209};
//		int[] duplicateNumbers=new int[allNumbers.length];
		Set<Integer> duplicateNumbers=new LinkedHashSet<Integer>();
//		int k=0;
		for(int i=0;i<allNumbers.length-1;i++)
		{
			for(int j=i+1;j<allNumbers.length;j++)
			{
				
				if(allNumbers[i]==allNumbers[j])
				{
					duplicateNumbers.add(allNumbers[i]);
					break;
				}
			}
		}
		
		if(!duplicateNumbers.isEmpty())
		{
			List<Integer> listDuplicate=new ArrayList<Integer>(duplicateNumbers.size());
			listDuplicate.addAll(duplicateNumbers);
			System.out.print("The Duplicate Numbers are: ");
			for(int i=0;i<listDuplicate.size();i++)
			{
				System.out.print(listDuplicate.get(i)+" ");
			}
		}
		else
			System.out.println("There are no Duplicate Numbers");
	}

}
