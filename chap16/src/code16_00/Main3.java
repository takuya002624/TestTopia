package code16_00;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main3 {

	public static void main(String[] args) {

		Map<String,List<String>> line = new HashMap<String,List<String>>();
		List<String> yamanote = new ArrayList<>();
		List<String> marunouchi = new ArrayList<String>();
		yamanote.add("東京駅");
		yamanote.add("池袋駅");
		yamanote.add("新宿駅");
		marunouchi.add("新宿三丁目駅");
		marunouchi.add("大手町駅");
		marunouchi.add("霞ケ関駅");
		line.put("山手線",yamanote);
		line.put("丸ノ内線",marunouchi);

		List<String> akb = new ArrayList<String>();
		akb.add("秋葉原駅");
		yamanote = akb ;
		System.out.println(yamanote.get(0));
		System.out.println(line.get("山手線").get(0));

	}

}
