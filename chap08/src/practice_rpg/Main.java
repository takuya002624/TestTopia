package practice_rpg;

public class Main {

	public static void main(String[] args) {

		Hero h = new Hero();
		Castle ca = new Castle();
		Inn in = new Inn();
		Bar ba = new Bar();
		Forest fo = new Forest();
		Dungeon du = new Dungeon();
		Mountain mo = new Mountain();

		h.name  = "hiro";
		h.hp = 100;
		h.gold = 500;
		h.eval = 0;

		ca.favorite(h);
		in.recover(h);
		ba.cuest(h);
		ba.cuest(h);
		fo.forestCuest(h, ba);
		ba.cuest(h);
		ba.cuest(h);
		fo.forestCuest(h, ba);
		ba.cuest(h);
		ba.cuest(h);
		du.dungeonCuest(h, ba);
		ba.cuest(h);
		ba.cuest(h);
		mo.mountainCuest(h, ba);
		ba.cuest(h);

		ca.favorite(h);


	}

}
