package code3_06;

public class Main2 {

	public static void main(String[] args) {
		int temp = 10;
		while (temp > 25) {
			temp--;
			System.out.println("温度を１度下げました");
		}
		System.out.println("whileの後の温度:" + temp);

		//do-while構文
		do {
			temp--;
			System.out.println("温度を１度下げました");
		}while (temp > 25);
		System.out.println("do-whileの後の温度:" + temp);


	}

}
