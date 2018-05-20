package week1day1;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Monday-1, Tuesday-2,Wednesday-3 & So on
		int givenDay=7;
		if (givenDay==1 || givenDay==2 || givenDay==3 || givenDay==4 ||givenDay==5)
		{
			System.out.println("The given day is a Weekday");
			if(givenDay==1 ||givenDay==5)
			{
				System.out.println("I have Client Calls");
			}
			else
			{
				System.out.println("I dont have client calls");
			}
		}
		else
		{
			System.out.println("The given day is a Weekend");
			if(givenDay==6)
			{
				System.out.println("I go to play on Saturday");
			}
			else
			{
				System.out.println("Rest at home on Sundays");
			}
		}
	}

}
