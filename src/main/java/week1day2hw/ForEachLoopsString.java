package week1day2hw;

public class ForEachLoopsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] friends= {"Bharath","Vishwanath","Ram","Ramya","Divya"};
		int numberMales=0;
		int numberFemales=0;

		for(String name:friends)
		{
			if (name.equalsIgnoreCase("Bharath") || name.equalsIgnoreCase("Vishwanath") || name.equalsIgnoreCase("Ram"))
			{
				numberMales=numberMales+1;
			}
			else
			{
				numberFemales=numberFemales+1;
			}
		}
		System.out.println("Number of Males: "+numberMales);
		System.out.println("Number of Females: "+numberFemales);
	}

}
