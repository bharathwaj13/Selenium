package interviewquestions50;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountOccurrenceInArray {

	public static void main(String[] args) {
		int[] myArray={1,1,2,3,3,3,4,5};
		Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<myArray.length;i++)
		{
			if (map.containsKey(myArray[i]))
				map.put(myArray[i], map.get(myArray[i])+1);
			else
				map.put(myArray[i], 1);
		}
		for (Entry<Integer,Integer> eachEntry : map.entrySet()) {
			System.out.println(eachEntry.getKey()+" - "+eachEntry.getValue());
		}
			
		

	}

}
