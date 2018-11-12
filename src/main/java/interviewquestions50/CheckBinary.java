package interviewquestions50;

public class CheckBinary {

	public static void main(String[] args) {
		int number=101012;
		int copyNumber=number;
		boolean flag=true;
		while(number>0)
		{
			int reminder=number%10;
			if(reminder>1)
			{
				flag=false;
				break;
			}
			number=number/10;
		}
		if(flag)
			System.out.println("The number "+copyNumber+" is binary");
		else
			System.out.println("The number "+copyNumber+" is not binary");
	}

}
