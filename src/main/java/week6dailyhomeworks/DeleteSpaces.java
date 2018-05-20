package week6dailyhomeworks;

import java.util.ArrayList;
import java.util.List;

public class DeleteSpaces {

	public static void main(String[] args) {
		String givenString=" aa bbbbbbb    c    dddd  ";
		int startIndex,counter=0,count=0,length=0;
		String newString="";
		for(startIndex=0;startIndex<givenString.length();startIndex++)
		{
			if(Character.isLetter(givenString.charAt(startIndex)))
				break;
		}
		char[] charArray = givenString.toCharArray();
		List<String> charList=new ArrayList<String>();
		for(int i=0;i<charArray.length;i++)
		{
			charList.add(charArray[i]+"");
		}
		for(int i=startIndex;i<charList.size();i++)
		{
			if(Character.isWhitespace(charList.get(i).charAt(0)))
			{
				counter++;
				if(counter>1)
				{
					while(Character.isLetter(charList.get(i).charAt(0))){
						charList=ShiftLeft(charList,i,charList.size());
//						i++;
						
						counter=0;
					}
				}
			}
			else
				counter=0;
		}
		for(int i=0;i<charList.size();i++)
		{
			newString=newString+charList.get(i);
		}
		System.out.println(newString);
	}

	public static List<String> ShiftLeft(List<String> chList,int position,int strLen) {
		
		chList.remove(position);
		return chList;
	}

}
