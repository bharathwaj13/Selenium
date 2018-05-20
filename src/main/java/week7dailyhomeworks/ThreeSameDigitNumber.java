package week7dailyhomeworks;

public class ThreeSameDigitNumber {

	public static void main(String[] args) {
		for(int i=1;i<10;i++)
		{
			for(int j=1;j<10;j++)
			{
				for(int k=1;k<10;k++)
				{
					if (i==j && j==k)
						System.out.print(Integer.toString(i)+Integer.toString(j)+Integer.toString(k)+" ,");
				}
			}
		}

	}

}
