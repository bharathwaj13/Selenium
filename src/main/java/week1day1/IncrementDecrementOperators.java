package week1day1;

public class IncrementDecrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int givenNumber=10;
//PreIncrement
++givenNumber;
System.out.println("PreIncrement: "+givenNumber);
System.out.println(givenNumber++);
//PostIncrement
givenNumber++;
System.out.println("PostIncrement: "+givenNumber);
//PreDecrement
--givenNumber;
System.out.println("PreDecrement: "+givenNumber);
//PostDecrement
givenNumber--;
System.out.println("PostDecrement: "+givenNumber);

	}

}
