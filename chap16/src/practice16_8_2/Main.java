package practice16_8_2;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero("斉藤");
		Hero h2 = new Hero("鈴木");

		Map<Hero,Integer> map = new HashMap<>();

		map.put(h1, 3);
		map.put(h2, 7);

		for(Hero key : map.keySet()) {
			int value = map.get(key);

			System.out.println(key.getName() + "が倒した敵＝" + value);

		}
	}

}
