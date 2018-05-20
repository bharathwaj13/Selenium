package week1day2;

public class ClassA {

	String name;
	int age;
	
	void displayMemberDetails()
	{
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
	}
	 ClassA(String namePerson,int agePerson)
	{
		name=namePerson;
		age=agePerson;
	}
}
