package week3dailyhomeworks;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int tempQuotient;
		int quotient=0;
		for(int i=100;i<=1000;i++)
		{
			tempQuotient=i;
			int sumOfCubes=0;
			do
			{
				int reminder=tempQuotient%10;
				sumOfCubes=sumOfCubes+(int) (Math.pow(reminder,3));
				quotient=tempQuotient/10;
				tempQuotient=quotient;
			}while(quotient>0);
			if(sumOfCubes==i)
				System.out.println(i+" is an Armstrong Number");
		}

	}

}
