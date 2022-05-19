package week1dailyhomeworks;

public class ExploreLogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=5;
int num2=3;
boolean flag=false;
if (!flag)
{
	if(num1==5&&num2++==3)
		System.out.println(num1+" "+num2);
		System.out.println("First AND Operator is true");
	if(num1==5||++num2==5)
		System.out.println(num1+" "+num2);
		System.out.println("First OR Operator is true");
	if(--num2==3&&num1++==5)
		System.out.println(num1+" "+num2);
		System.out.println("Second AND Operator is true");
	if(num2--==4||++num1==7)
		System.out.println(num1+" "+num2);
		System.out.println("Second OR Operator is true");
}
	}

}
