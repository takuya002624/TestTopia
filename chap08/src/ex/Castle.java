package ex;

public class Castle {


	public void contact(Hero h) {
		System.out.println("城に訪れた。");
		System.out.println("勇者よ。よくぞ参った。");
		if(h.grade <= 100) {
			System.out.println("おぬしの評価はまだまだ低い。");
			System.out.println("もう少し世のために働いて評価を上げるのじゃ。");
		}else {
			System.out.println("おぬしは勇者として十分な評価を得ている。");
			System.out.println("この調子で魔王を倒すのじゃ！");
		}
	}
}
