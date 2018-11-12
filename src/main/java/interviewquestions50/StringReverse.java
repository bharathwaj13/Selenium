package interviewquestions50;

public class StringReverse {

	public static void main(String[] args) {
		String name="I will win this interview";
		String reverse="";
		for(int i=0;i<name.length();i++)
		{
			reverse=name.charAt(i)+""+reverse;
		}
		System.out.println(reverse);
	}

}
