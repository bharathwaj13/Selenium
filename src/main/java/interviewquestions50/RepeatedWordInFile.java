package interviewquestions50;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class RepeatedWordInFile {

	public static void main(String[] args) {
		Map<String,Integer> map=new TreeMap<String,Integer>();
		BufferedReader reader=null;
		try {
			reader=new BufferedReader(new FileReader("G:\\TestLeaf Homeworks\\Answers\\Daily\\DailyQuestion_Day13_Answer.txt"));
			String eachLine = reader.readLine();
			while(eachLine!=null)
			{
				String[] words = eachLine.split(" ");
				for (String string : words) {
					if(string!=" ") {
						if (map.containsKey(string))
							map.put(string, map.get(string)+1);
						else
							map.put(string, 1);
					}
				}
				eachLine=reader.readLine();
			}
			int count=0;
			String maxWord="";
			for (Entry<String,Integer> eachEntry :map.entrySet()) {
				if(eachEntry.getValue()>count)
				{
					count=eachEntry.getValue();
					maxWord=eachEntry.getKey();
				}
			}
			System.out.println("The word with max number of occurence is: "+maxWord);
		} catch (IOException e) {
			System.err.println("Mentioned file is not found in the Path");
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			}
			catch(IOException e){
				e.printStackTrace();
				System.err.println("Cannot close the Buffered Object");
			}
		}
	}

}
