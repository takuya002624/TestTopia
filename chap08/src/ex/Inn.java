package ex;

public class Inn {
	int grade;	// 評価

	public void otomari(Hero h) {
		System.out.println("宿屋に訪れた。");
		this.grade += 10;
		System.out.println("お疲れのようですね。ゆっくりお休みください。");
		if(this.grade <= 100) {
			h.hp += 100;
			h.gold -= 100;
			System.out.println("お金が100減った。HPが100回復した。");
		}else {
			h.hp += 200;
			h.gold -= 100;
			System.out.println("お得意様なので特別にいい部屋を用意しています。");
			System.out.println("お代はこれまで通りで結構です。");
			System.out.println("お金が100減った。HPが200回復した。");
		}
	}
}
