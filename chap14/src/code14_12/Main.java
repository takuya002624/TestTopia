package code14_12;

public class Main {

	public static void main(String[] args) {

//		//1人も勇者を生み出していない状況で…
//		Hero.money = 100;
//		System.out.println(Hero.money);

		Hero.setRandamMoney();
		System.out.println(Hero.money);
		Hero h1 = new Hero("ミナト",100);
		System.out.println(h1.money);

	}

}
