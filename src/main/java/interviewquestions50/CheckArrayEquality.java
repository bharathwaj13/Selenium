package interviewquestions50;

import java.util.Arrays;

public class CheckArrayEquality {

	public static void main(String[] args) {
		int[] array1= {1,2,3,4};
		int[] array2= {1,2,3,4};
		int[] array3= {1,3,2,4};
		System.out.println(Arrays.equals(array1, array2));
		System.out.println(Arrays.equals(array1, array3));
	}

}
