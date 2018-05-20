package week4dailyhomeworks;

public class FindPercentageAndNumber {

	public static void main(String[] args) {
		String sentence="Tiger runs at the Speed of 100 km/Hr";

		int length = sentence.length();
		System.out.println("Total number of Characters is :"+length);
		int countUcase=0,countLcase=0,countDigits=0,countOthers=0;
		for(int i=0;i<length;i++)
		{
			if(Character.isUpperCase(sentence.charAt(i)))
				countUcase++;
			else if(Character.isLowerCase((sentence.charAt(i))))
				countLcase++;
			else if(Character.isDigit((sentence.charAt(i))))
				countDigits++;
			else
				countOthers++;
		}
		System.out.println("Number of Uppercase Letters is "+countUcase+".So Percentage is "+(float)(countUcase*100/length)+"%");
		System.out.println("Number of Lowercase Letters is "+countLcase+".So Percentage is "+(float)(countLcase*100/length)+"%");
		System.out.println("Number of Digits is "+countDigits+".So Percentage is "+(float)(countDigits*100/length)+"%");
		System.out.println("Number of Other Characters is "+countOthers+".So Percentage is "+(float)(countOthers*100/length)+"%");
	}

}
