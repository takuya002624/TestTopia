package practice4;

public class Practice4_2 {

	public static void main(String[] args) {
		int[] moneyList = {121902, 8302, 55100}; //口座残高

		for (int i = 0; i < moneyList.length; i++) { //for文で出力
			System.out.println(moneyList[i]);
		}
		for (int i : moneyList) { //拡張for文で出力
			System.out.println(i);
		}

	}

}
