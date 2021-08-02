package practice11_5;

public class Computer extends TangibleAsset{

	String makerName;

	//コントラクタ
	public Computer(String name, int price, String color, String makerName) {
		super(name,price,color);

		this.makerName = makerName;
	}

	//メソッド
	public String getMakerName() {

		return this.makerName;
	}

}
