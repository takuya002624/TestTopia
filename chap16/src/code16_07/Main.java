package code16_07;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String,Integer> prefs = new HashMap<>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 182);

		//県名一覧を取得し繰り返す
		for(String key : prefs.keySet()) {

			//県名(キー)を指定し人口(値)を取得
			int value = prefs.get(key);
			System.out.println(key + "の人口は、" + value);
		}

	}

}
