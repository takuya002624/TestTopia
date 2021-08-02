package practice11_5;

public class Book extends TangibleAsset{

	String isbn;

	//コントラクタ
	public Book(String name, int price, String color, String isbn) {
		super(name,price,color);

		this.isbn = isbn;
	}

	//メソッド
	public String getIsbn() {

		return this.isbn;
	}
}
