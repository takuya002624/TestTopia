package code16_08;

import java.util.ArrayList;
import java.util.List;

class Hero{
	public String name;
}


public class Main {

	public static void main(String[] args) {

		Hero h = new Hero();
		h.name = "ミナト";

		List<Hero> list = new ArrayList<>();
		//hをリストに格納
		list.add(h);

		//格納後にhのnameを書き換え
		h.name = "スガワラ";
		System.out.println(list.get(0).name);
	}

}
