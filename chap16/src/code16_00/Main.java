package code16_00;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		//配列
		String[] names1 = new String[3];
		names1[0] = "たなか";
		names1[1] = "すずき";
		names1[2] = "さいとう";

		System.out.println(names1[1]);

		//ArrayList
		ArrayList<String> names2 = new ArrayList</*String*/>();

		names2.add("たなか");
		names2.add("すずき");
		names2.add("さいとう");

		System.out.println(names2.get(1));
	}

}
