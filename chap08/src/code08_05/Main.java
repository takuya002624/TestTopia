package code08_05;

public class Main {

	public static void main(String[] args) {

		Hero h = new Hero(); //勇者を生成し初期化
		h.name = "ミナト";
		h.hp = 100;

		Matango m1 = new Matango();	//お化けキノコA(１匹目)を生成し初期化
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango();	//お化けキノコB(2匹目)を生成し初期化
		m1.hp = 48;
		m1.suffix = 'B';

		//冒険のはじまり
		h.slip(); //転べ
		m1.run(); //お化けキノコAが逃げる
		m2.run(); //お化けキノコBも逃げる
		h.run(); //逃げろ
	}

}
