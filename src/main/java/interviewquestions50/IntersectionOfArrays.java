package interviewquestions50;

import java.util.LinkedHashSet;
import java.util.Set;

public class IntersectionOfArrays {

	public static void main(String[] args) {
		int[] array1= {1,2,3,5,61};
		int[] array2= {1,2,3,6,78};
		Set<Integer> set=new LinkedHashSet<Integer>();
		for (Integer eachElement : array1) {
			set.add(eachElement);
		}
		for (Integer eachElement : array2) {
			if(set.contains(eachElement))
				System.out.println(eachElement);
		}

	}

}
