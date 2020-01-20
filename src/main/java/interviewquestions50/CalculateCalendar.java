package interviewquestions50;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class CalculateCalendar {

	public static void main(String[] args) {
		Locale english = Locale.ENGLISH;
		TimeZone timeZone = TimeZone.getTimeZone("IST");
		Calendar instance = Calendar.getInstance(timeZone, english);
		int month = instance.get(Calendar.MONTH)+1;
		int hour=instance.get(Calendar.HOUR_OF_DAY);
		int minute = instance.get(Calendar.MINUTE);
		int second = instance.get(Calendar.SECOND);
		System.out.println(month +" "+ hour+" "+minute+" "+second);
	}

}
