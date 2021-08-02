package code10_11;

public class Item {

	String name;
	int price;
	public Item(String name){
		this.name = name;
		this.price = 0;
	}

	public Item(String name,int price){
		this.name = name;
		this.price = price;
	}

/*	自動でコントラクタを呼び出す場合、引数なしのsuper();を作るためエラーがでる。
	なので、引数なしのコントラクタがあれば呼び出せる。
	public Item() {
	}
*/
}
