package week5dailyhomeworks;

public class StringWithUniqueCharacters {

	public static void main(String[] args) {
		String givenString="Good Looking";
		int stringLength=givenString.length();
		String replace="";
		for(int i=0;i<stringLength;i++)
		{
			char character=givenString.charAt(i);
			if(replace.toLowerCase().indexOf(character)<0)
			{
				replace=replace+character;
			}
		}
		replace=replace.replaceAll(" ", "");
		System.out.println(replace);

	}

}
