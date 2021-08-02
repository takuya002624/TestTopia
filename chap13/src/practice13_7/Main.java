package practice13_7;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero("ミナト", 100);
		Wand wand = new Wand("樫の杖",1.3);
		Wizard w = new Wizard(80,30,"スガワラ",wand);

		w.heal(h);
	}

}
