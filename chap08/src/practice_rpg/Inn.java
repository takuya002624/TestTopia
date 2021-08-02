package practice_rpg;

public class Inn {

	//宿主インスタンス
	public void recover(Hero h) {
		System.out.println("やどや に ついた。");

		System.out.println("「" + h.name + "よ、やすんでいきな」");
		h.gold -= 100;
		h.hp += 100;
		System.out.println(h.name + "は、100goldはらい、HPを100かいふくした");
		System.out.println("「いってらっしゃい！」");
		System.out.println(" HP：" + h.hp + "しょじきん：" + h.gold);
		System.out.println("");
	}
}
