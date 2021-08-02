package practice11_5_re;

public class Compter extends TangibleAsset{

	String makerName;

	//コントラクタ
	public Compter (String name, int price, String color, String makerName) {

		super(name,price,color);

		this.makerName = makerName;
	}

	//メソッド
	public String getMakerName() {

		return this.makerName;
	}
}
