package week1dailyhomeworks;
import java.util.Scanner;
public class PrintPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int j=2;
		boolean flag=false;
		while(!flag)
		{
			System.out.print("Enter number "+i+": ");
			Scanner scan=new Scanner(System.in);
			int givenNumber=scan.nextInt();
			//			scan.close();
			if(givenNumber>1)
			{
				for(j=2;j<givenNumber;j++)
				{
					if(givenNumber%j==0)
					{
						System.out.println("Entered Number is "+givenNumber);
						i++;
						break;
					}

				}
				if(j==givenNumber)
				{
					System.out.println("Entered Number is "+givenNumber+" - A Prime Number");
					System.out.println("Total Numbers entered are "+i);
					scan.close();
					flag=true;
				}
			}
			else
			{
				System.out.println("Entered number "+givenNumber+" is not greater than 1");
				i++;
			}
//			scan.close();
		}

	}
}