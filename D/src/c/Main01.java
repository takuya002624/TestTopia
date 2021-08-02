package c;

import java.util.Calendar;
import java.util.Date;

public class Main01 {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		Date d = new Date();


		c.setTime(d);

		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH);
		int da = c.get(Calendar.DAY_OF_MONTH);
		int h = c.get(Calendar.HOUR);
		int mi = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);

		System.out.println(y + "年" + (m + 1) + "月" + da + "日" + h + "時" + mi + "分" + s + "秒");
	}

}
