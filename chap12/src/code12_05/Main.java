package code12_05;

public class Main {

	public static void main(String[] args) {

		Slime s = new Slime();
		Monster m = new Slime();
		Slime sl = (Slime)m;

		s.run();
		m.run();

	}

}
