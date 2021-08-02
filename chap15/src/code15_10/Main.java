package code15_10;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		//ここで何らかの時間がかかる処理
		long end = System.currentTimeMillis();

	System.out.println("処理にかかった時間は…" + (end - start) + "ミリ秒でした");


	Date d = new Date();

	System.out.println(d);
	}

}
