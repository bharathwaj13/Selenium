package week9dailyhomeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortHashMapUsingKey {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(21, "Twenty One");
		map.put(41, "Forty One");
		map.put(31, "Thirty One");
		Map<Integer,String> sortMap=new TreeMap<Integer,String>(map);
		for(Entry<Integer,String> eachEntry: sortMap.entrySet())
		{
			System.out.println(eachEntry.getKey() + "=" + eachEntry.getValue());
		}
	}

}
