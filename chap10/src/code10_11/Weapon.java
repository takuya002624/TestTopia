package code10_11;

public class Weapon extends Item{

/*自動的に引数なしのデフォルトコンストラクタを呼び出す
 * public Weapon(){
 *
 * 		親クラスのコントラクタの呼び出し
 * 		super();
 * }
 */

	public Weapon() {
		//引数を持っているコントラクタを指定する
		super("ななしの剣");

	}
}
