package code10_03;

public class SuperHero extends Hero {

	boolean flying; //追加したflying


	//追加したfly()
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");

	}

	//追加したland()
	public void land() {
		this.flying = false;
		System.out.println("着地した！");

	}
}
