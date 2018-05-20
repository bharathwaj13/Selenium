package week6dailyhomeworks;

public class LearnStaticMethodsAndVariables {
	
	static String firstString="Hello";
	String secondString="World";
	
	public static void firstMethod() {
		System.out.println(firstString+" "+new LearnStaticMethodsAndVariables().secondString);
	}
	
	public void secondMethod() {
		System.out.println(firstString+" "+secondString);
	}
	
	public static void main(String[] args) {
		firstMethod();
		new LearnStaticMethodsAndVariables().secondMethod();
	}

}
