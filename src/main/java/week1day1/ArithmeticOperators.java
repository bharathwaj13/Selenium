package week1day1;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float firstNumber=10.3f;
		float secondNumber=11f;
		float result=0f;
		//Enter 1-Addition, 2-Subtraction, 3-Multiplication, 4-Division, 5-Modulus
		int operationType=5;
		switch(operationType)
		{
		case 1:
			result=firstNumber+secondNumber;
			break;
		case 2:
			result=firstNumber-secondNumber;
			break;
		case 3:
			result=firstNumber*secondNumber;
			break;
		case 4:
			result=firstNumber/secondNumber;
			break;
		case 5:
			result=firstNumber%secondNumber;
			break;
		default:
			System.out.println("Invalid Entry");
		}
		System.out.println("Result: "+result);

	}

}
