package week9dailyhomeworks;

import org.testng.annotations.Test;

public class ConvertLowerToUpperCase {
	@Test
	public void main() {
		String lower="bharath";
		String upper="";
		for(int i=0;i<lower.length();i++)
		{
			upper=upper+Character.toUpperCase(lower.charAt(i));
		}
		System.out.println(upper);
	}

}
