package practice15_9;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DAY_OF_MONTH, day + 100);
		Date d = c.getTime();

		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");

		System.out.println(f.format(d));
	}

}
