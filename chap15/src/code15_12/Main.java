package code15_12;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		//6つのint値から４Dateインスタンスを生成
		c.set(2019, 8, 22, 1, 23, 45);

		//月を9(10月)に変更
		c.set(Calendar.MONTH, 9);

		Date d = c.getTime();
		System.out.println(d);

		Date now = new Date();
		c.setTime(now);

		//年を取り出す
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");
	}

}
