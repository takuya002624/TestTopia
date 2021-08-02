package ex;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero();
		Castle cs = new Castle();
		Inn inn = new Inn();
		Bar bar = new Bar();
		Forest f = new Forest();
		h.name = "ミナト";
		h.hp = 100;
		h.gold = 100;
		// 城に行くイベント
		cs.contact(h);
		// 酒場に行くイベント
		bar.quest(h);
		bar.quest(h);
		// 森へ行くイベント
		f.collecting(h, bar);
		// 酒場に行くイベント
		bar.quest(h);
		// 宿屋に行くイベント
		inn.otomari(h);
	}

}
