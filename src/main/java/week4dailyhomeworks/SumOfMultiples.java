package week4dailyhomeworks;

public class SumOfMultiples {

	public static void main(String[] args) {
		int multiplier1=3;
		int multiplier2=5;
		int sum1=0;
		int sum2=0;
		int m1=0;
		int m2=0;
		boolean m1flag=false,m2flag=false;
		for(int i=1;;i++)
		{
			m1=multiplier1*i;
			if(m1<100)
			{
				if(m1%multiplier2!=0)
					sum1=sum1+m1;
			}
			else
				m1flag=true;
			m2=multiplier2*i;
			if(m2<100)
				sum2=sum2+m2;
			else
				m2flag=true;
			if(m1flag&&m2flag)
				break;
		}
		System.out.println("The sum of Multiples of "+multiplier1+" or "+multiplier2+" below 100 is "+(sum1+sum2));


	}

}
