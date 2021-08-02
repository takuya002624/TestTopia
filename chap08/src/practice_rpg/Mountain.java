package practice_rpg;

import java.util.Random;

public class Mountain {

	//山インスタンス
	public void mountainCuest(Hero h,Bar ba) {
		System.out.println("やまに ドラゴン を たいじ しにきた！");
		System.out.println("ドラゴン のこうげき！");
		int damage = new Random().nextInt(100) + 51;
		h.hp -= damage;
		System.out.println(h.name + "は " + damage + " のダメージをうけた！");

		System.out.println("");

		ba.clear = true;
	}
}
