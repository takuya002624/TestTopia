package code15_14;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {

		//Instantの生成
		Instant i1 = Instant.now();	//現在の日時を取得

		//Instantとlong値との相互変換
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		long l = i2.toEpochMilli();

		//ZonedDateTimeの生成
		// 東京時間 2020年1月2日3時4分5秒6ナノ秒 を指定して取得
		ZonedDateTime z1 = ZonedDateTime.now();//現在の日時を取得
		ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));

		//InstantとZonedDateTimeの相互変換
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

		//ZonedDateTimeの利用方法
		System.out.println("東京：" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		System.out.println("ロンドン：" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());

		//同じ瞬間の判定には、equals()ではなくisEquals()を使う
		if(z2.isEqual(z3)) {
			System.out.println("これらは同じ瞬間を指しています");
		}

		System.out.println();
		System.out.println(i1);
		System.out.println(z1);


	}

}
