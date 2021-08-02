package practice16_8_1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero("斉藤");
		Hero h2 = new Hero("鈴木");

		List<Hero> array = new ArrayList<>();
		array.add(h1);
		array.add(h2);

		for(Hero h : array) {
			System.out.println(h.getName());
		}

	}

}
