package week3dailyhomeworks;

public class FindDuplicateNumbersWithoutFunctions {

	public static void main(String[] args) {
		int[] allNumbers= {1,3,4,89,65,45,98,41,209,432,1,3,3,45,45,209};
		int[] duplicateNumbers=new int[allNumbers.length];
		//		Set<Integer> duplicateNumbers=new LinkedHashSet<Integer>();
		int k=0;
		for(int i=0;i<allNumbers.length-1;i++)
		{
			for(int j=i+1;j<allNumbers.length;j++)
			{

				if(allNumbers[i]==allNumbers[j])
				{
					boolean dupCheck=false;
					//					duplicateNumbers.add(allNumbers[i]);
					if(k>0)
					{
						for(int g=0;g<k-1;g++)
						{
							if(duplicateNumbers[g]==allNumbers[i])
							{
								dupCheck=true;
								break;
							}
						}
						if(!dupCheck)
						{
							duplicateNumbers[k]=allNumbers[i];
							k++;
							break;
						}
					}
					else
					{
						duplicateNumbers[k]=allNumbers[i];
						k++;
						break;
					}
				}
			}
		}

		if(duplicateNumbers.length>0)
		{
			//			List<Integer> listDuplicate=new ArrayList<Integer>(duplicateNumbers.size());
			//			listDuplicate.addAll(duplicateNumbers);
			System.out.print("The Duplicate Numbers are: ");
			for(int i=0;i<duplicateNumbers.length;i++)
			{
				if(duplicateNumbers[i]>0)
					System.out.print(duplicateNumbers[i]+" ");
			}
		}
		else
			System.out.println("There are no Duplicate Numbers");
	}

}
