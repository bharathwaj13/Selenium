package week6dailyhomeworks;

public class LargestPositiveSequence {

	public static void main(String[] args) {
		int[] input= {-1,2,-3,-4,-8,9,10,5,6,7};
		int currentSequenceStart=0,currentSequenceCount=1,maxSequenceStart=0,maxSequenceCount=0;
		for(int i=0;i<input.length-1;i++)
		{
			if(input[i]>0 && input[i+1]>0 && input[i+1]==input[i]+1)
			{
				currentSequenceCount++;
				if(currentSequenceCount>maxSequenceCount)
				{
					maxSequenceCount=currentSequenceCount;
					maxSequenceStart=currentSequenceStart;
				}
			}
			else
			{
				currentSequenceCount=1;
				currentSequenceStart=i+1;
			}

		}
		System.out.println("The Largest positive Sequence is "+maxSequenceCount);
		System.out.println("The Sequence is: ");
		for(int i=maxSequenceStart;i<maxSequenceStart+maxSequenceCount;i++)
		{
			System.out.print(input[i]+" ");
		}
	}

}
