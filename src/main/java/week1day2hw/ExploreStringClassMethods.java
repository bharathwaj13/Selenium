package week1day2hw;

public class ExploreStringClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Bhar ath";
		int index=name.offsetByCodePoints(2, 4);
		System.out.println(index);
		int stringLength=name.length(); //Returns the String Lenth
		System.out.println(stringLength);
		char abc=name.charAt(3); //Returns the character at that specific index
		System.out.println(abc);
		String exploreSubString=name.substring(4);
		System.out.println(exploreSubString);
		boolean result=name.contains("Bh");
		System.out.println(result);
		String fullName=name.concat("Waj");
		System.out.println(fullName);
		String replaceName=name.replace("Bha", "Sha");
		System.out.println(replaceName);
	}

}
