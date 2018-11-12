package interviewquestions50;

public class SeparateZerosInArray {

	public static void main(String[] args) {
		int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		int n = arr.length;
		pushZerosToEnd(arr, n);
		System.out.println("Array after pushing zeros to the back: ");
		for (int i=0; i<n; i++)
			System.out.print(arr[i]+" ");

	}


	// Function which pushes all zeros to end of an array.
	static void pushZerosToEnd(int arr[], int n)
	{
		int count = 0;  // Count of non-zero elements

		// Traverse the array. If element encountered is
		// non-zero, then replace the element at index 'count'
		// with this element
		for (int i = 0; i < n; i++)
		{
			if (arr[i] != 0)
			{
				arr[count] = arr[i];
				count++;
			}
		}
		// here count is
		// incremented

		// Now all non-zero elements have been shifted to
		// front and 'count' is set as index of first 0.
		// Make all elements 0 from count to end.
		/*while (count < n)
		{
			arr[count] = 0;
			count++;
		}*/
		
		for(int i=count;i<n;i++)
		{
			arr[i]=0;
		}
	}

}
