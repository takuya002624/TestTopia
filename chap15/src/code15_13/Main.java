package code15_13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception{

		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		//文字列からDateインスタンスを生成
		Date d = f.parse("2020/09/22 01:23:45");
		System.out.println(d);

		//Dateインスタンスから文字列を生成
		Date now = new Date();
		String s = f.format(now);

		System.out.println("現在は" + s + "です");


		SimpleDateFormat f1 = new SimpleDateFormat("yyyy年MM月dd日 KK時mm分ss秒");

		//Dateインスタンスから文字列を生成
		Date now1 = new Date();
		String s1 = f1.format(now1);

		System.out.println("現在は" + s1 + "です");
	}

}
