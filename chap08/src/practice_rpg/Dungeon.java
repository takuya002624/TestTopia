package practice_rpg;

import java.util.Random;

public class Dungeon {

	//洞窟インスタンス
	public void dungeonCuest(Hero h,Bar ba) {
		System.out.println("どうくつに ゴブリン を たいじ しにきた！");
		System.out.println("ゴブリン のこうげき！");
		int damage = new Random().nextInt(50) + 21;
		h.hp -= damage;
		System.out.println(h.name + "は " + damage + " のダメージをうけた！");


		System.out.println("");

		ba.clear = true;
	}
}
