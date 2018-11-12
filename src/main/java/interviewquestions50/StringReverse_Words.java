package interviewquestions50;

public class StringReverse_Words {

	public static void main(String[] args) {
		String name="I will win this interview";
		String[] split = name.split(" ");
		for(int i=0;i<split.length;i++)
		{
			System.out.print(reverseString(split[i])+" ");
		}
	}

	public static String reverseString(String word)
	{
		String reverse="";
		for(int i=0;i<word.length();i++)
		{
			reverse=word.charAt(i)+""+reverse;
		}
		return reverse;
	}

}
