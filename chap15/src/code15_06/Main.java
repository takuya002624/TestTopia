package code15_06;

public class Main {

	public static void main(String[] args) {

		PlayerName pn = new PlayerName();

		if(!(pn.isValidPlayerName("MINATO01"))) {
			System.out.println("最初はA～Z、2文字目から8文字目まではA～Zと0～9で入力してください");
		} else {
			System.out.println("正しく入力されました");
		}

	}

}
