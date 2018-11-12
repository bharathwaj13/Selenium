package interviewquestions50;

public class RemoveWhiteSpacesInString {

	public static void main(String[] args) {
		String name="  I will win      this interview ";
//		name=name.replaceAll("\\s", "");
		name=name.replaceAll(" ", "");
		System.out.println(name);
	}

}
