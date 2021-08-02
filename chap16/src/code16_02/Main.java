package code16_02;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		names.add("湊");
		names.add("朝香");
		names.add("菅原");


		//イテレータの取得
		Iterator<String> it = names.iterator();

		//イテレータを用いたリスト要素の取り出し
		while(it.hasNext()) {	//矢印を次に進められるなら繰り返す
			String e = it.next();	//矢印を次に進め、内容を取り出す
			System.out.println(e);
		}

	}

}
