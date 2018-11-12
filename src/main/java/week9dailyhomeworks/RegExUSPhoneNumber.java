package week9dailyhomeworks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExUSPhoneNumber {

	public static void main(String args[]){
		String sPhoneNumber = "(456) 888-9999";


		  Pattern pattern = Pattern.compile("\\([4-6]{1}[0-9]{2}\\) [0-9]{3}\\-[0-9]{4}$");
		  Matcher matcher = pattern.matcher(sPhoneNumber);

		  if (matcher.matches()) {
		      System.out.println("Phone Number Valid");
		  }
		  else
		  {
		      System.out.println("Phone Number must be in the form XXX-XXXXXXX");
		  }
		}

}
