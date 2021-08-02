package code10_07;

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
	//逃げる：親クラスにも定義してあるが、子クラスで再定義(上書き)するメソッド
	public void run() {
		System.out.println(this.name + "は撤退した！");

	}

	//Heroクラスでslip()はfinalで定義されているため、オーバーライドできない
	// public void slip() {
	//	System.out.println(this.name + "は転倒した！");
	//}
}
