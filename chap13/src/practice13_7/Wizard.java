package practice13_7;

public class Wizard {

	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public void heal(Hero h) {
		int bacePoint = 10; //基本回復ポイント
		int recovPoint = (int) (bacePoint * this.getWand().getPower()); //杖による増幅
		h.setHp(h.getHp() + recovPoint); //勇者のHPを回復する

		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			hp = 0;
		} else {
			this.hp = hp;
		}
	}

	public int getMp() {
		return this.mp;
	}

	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException("MPは0以上で設定してください。");
		}

		this.mp = mp;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("３文字以上の名前を設定してください。");
		}

		this.name = name;
	}

	public Wand getWand() {
		return this.wand;
	}

	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("杖を装備させてください。");
		}

		this.wand = wand;
	}

	public Wizard(int hp,int mp,String name,Wand wand) {
		this.setHp(hp);
		this.setMp(mp);
		this.setName(name);
		this.setWand(wand);
	}
}
