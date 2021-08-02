package code16_00;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main4 {

	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
		List<String> b = new ArrayList<>();
		Map<String,List<String>> map = new HashMap<>();

		a.add("あ");
		a.add("い");
		a.add("う");
		a.add("え");
		a.add("お");
		b.add("か");
		b.add("き");
		b.add("く");
		b.add("け");
		b.add("こ");

		map.put("ア行", a);
		map.put("カ行", b);
		List<String> c = new ArrayList<>();
		c.add("さ");
		a = c;

		System.out.println(a.get(0));
		System.out.println(map.get("ア行").get(0));
	}

}
