package week1dailyhomeworks;

public class FibonacciSeriesUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0;
int j=1;
int sum=0;
System.out.print(i+", ");
System.out.print(j+", ");
for(;;)
{
	sum=i+j;
	i=j;
	j=sum;
	if(sum<=100)
		System.out.print(sum+", ");
	else
		break;
}
	}

}
