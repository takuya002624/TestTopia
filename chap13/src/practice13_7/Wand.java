package practice13_7;

public class Wand {

	private String name; //杖の名前
	private double power; //杖の魔力

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(name == null ||name.length() < 3) {
			throw new IllegalArgumentException("３文字以上の名前を設定してください。");
		}

		this.name = name;
	}

	public double getPower() {
		return this.power;
	}
	public void setPower(double power) {
		if(power < 0.5 || power > 100.0) {
			throw new IllegalArgumentException("0.5以上100以下で設定してください。");
		}

		this.power = power;
	}

	public Wand(String name,double power) {
		this.setName(name);
		this.setPower(power);
	}


}
