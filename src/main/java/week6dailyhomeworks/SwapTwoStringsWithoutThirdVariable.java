package week6dailyhomeworks;

public class SwapTwoStringsWithoutThirdVariable {

	public static void main(String[] args) {
		String firstString="Hello How are you";
		String secondString="This is Bharath";
		firstString=firstString+","+secondString;
		secondString=(firstString.split(","))[0];
		firstString=(firstString.split(","))[1];
		System.out.println(firstString);
		System.out.println(secondString);
	}

}
