package practice08;

public class Cleric {

	String name; //名前
	int hp = 50; //HP
	final int MAXHP = 50; //最大HP
	int mp = 10; //MP
	final int MAXMP = 10; //最大MP

	public void selfAid() {//セルフエイド
		System.out.println(name + "は、セルフエイドをとなえた！");
		if (this.mp >= 5) {
			this.mp -= 5; //MPを5消費
			this.hp = this.MAXHP; //HPを最大HPまで回復
			System.out.println("HPがさいだいになった！");
		}
		System.out.println(name + "は、MPがたりない");
	}

	public int pray(int sec) { //祈る
		System.out.println(name + "は、" + sec +"びょうかん　てんにいのった！");
		if (this.mp < this.MAXMP) {
			this.mp += new java.util.Random().nextInt(3) + sec; //MPを0~2(ランダム) + 秒数で回復
			if (this.mp > this.MAXMP) { //MPが最大MPを超えた場合
				this.mp = this.MAXMP; //最大MPにする
			}
			System.out.println(name + "のMPはもうさいだいだ！");
		}
		/* int recover = new Random().nextInt(3) + sec;
		 * int recoverActual = MAth.min(this.MAXHP - this.mp,recover);
		 * this.mp += recoverActual;
		 * return recoverActual;
*/
		return mp;
	}
}
