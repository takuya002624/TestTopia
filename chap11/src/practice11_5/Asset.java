package practice11_5;

public abstract class Asset {

	String name;
	int price;

	//コントラクタ
	public Asset(String name, int price) {
		this.name = name;
		this.price = price;
	}

	//メソッド
	public String getName() {

		return name;
	}

	public int getPrice() {
		return price;
	}
}
