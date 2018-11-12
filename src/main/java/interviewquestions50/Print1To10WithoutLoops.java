package interviewquestions50;

public class Print1To10WithoutLoops {

	public static void main(String[] args) {
		int count=1;
		recursiveMethod(count);
	}
	
	public static void recursiveMethod(int num) {
		System.out.println(num++);
		if(num<=10)
			recursiveMethod(num);
	}

}
