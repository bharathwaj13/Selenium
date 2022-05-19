package week9day1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegex {

	public static void main(String[] args) {

		//Email ID Regex
		//		String patt="[\\w]*@[a-zA-Z]*.com";
		//		String str="bharathwaj@HCL.com";

		//Date of Birth
		//		String patt="[0-9]{2}/[0-9]{2}/[12][0-9]{3}";
		//		String str="13/05/1945";

		//Pan Card
		/*String patt="[a-zA-Z]{5}[\\d]{4}[a-zA-Z]";
		String str="BKJdw8734f";*/

		/*
		 * Pattern p=Pattern.compile(patt); Matcher m=p.matcher(str);
		 */
			

		String patt="[\\w]{5}[\\d]{3}";
		String str="sasafabcde123dsfsdfvd";

		Pattern p=Pattern.compile(patt);
		Matcher m=p.matcher(str);
		System.out.println(m.matches());
		while(m.find())
		{
			System.out.println("Start Index: "+m.start()+" End Index: "+m.end()+" SubString: "+m.group());
		}
	}

}
