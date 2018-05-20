package week6dailyhomeworks;

public class DeleteSpaces_Arun {

	public static void main(String[] args) {
		String letters="ww  aaa wer   ert   ";
		int counter=0;
		String newChar="";
		char[] eachChar=letters.toCharArray();
		for (int i=0;i<eachChar.length;i++)
		{
			if (Character.isSpace(eachChar[i]))
			{
				if(counter>0) {
					counter=counter+1;
				}
				else 
				{
					newChar=newChar+eachChar[i];
					counter=counter+1;
				}
			}
			else {
				newChar=newChar+eachChar[i];
				counter=0;
			}
		}
		System.out.println(newChar);
	}
}


