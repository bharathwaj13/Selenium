package week7dailyhomeworks;

import java.util.Map;
import java.util.TreeMap;

public class FindEachCharacterCount {

	public static void main(String[] args) {

		String givenData="i will win this interview";

		Map<String,Integer> mapInput=new TreeMap<String, Integer>();

		for(int i=0;i<givenData.length();i++)
		{
			if(mapInput.containsKey(givenData.charAt(i)+""))
				mapInput.put(givenData.charAt(i)+"", mapInput.get(givenData.charAt(i)+"")+1);
			else
				mapInput.put(givenData.charAt(i)+"", 1);
		}

		System.out.print(mapInput);


	}

}
