package week1day2hw;

public class ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA obj=new ClassA();
		float result=obj.add(2, 3);
		System.out.println("Sum is "+result);
		result=obj.divide(6, 2);
		System.out.println("Quotient is "+result);
		result=obj.multiply(6, 3);
		System.out.println("Product is "+result);
		result=obj.subtract(6, 3);
		System.out.println("Difference is "+result);
	}

}
