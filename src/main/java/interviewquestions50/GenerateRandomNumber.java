package interviewquestions50;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		int minRange=5;
		int maxRange=10;
		/*int random=(int)(Math.random()*(maxRange-minRange+1))+minRange;
		System.out.println(random);*/
		Random rand=new Random();
		int random = rand.ints(minRange, maxRange).findFirst().getAsInt();
		System.out.println(random);
	}

}
