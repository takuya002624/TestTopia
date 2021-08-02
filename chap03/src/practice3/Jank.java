package practice3;

public class Jank {

	public static void main(String[] args) {

		System.out.println("じゃんけんをします");
		for(;;) {
			System.out.println("じゃんけん！");
			for (;;) {
				System.out.println("グー = 0,チョキ = 1,パー= 2 を入力してください");

				//0="グー",1="チョキ",2="パー"

				int ran = new java.util.Random().nextInt(2);

				int input = new java.util.Scanner(System.in).nextInt();

				switch (ran) {
					case 0:
						String jan1 = "グー!";
						System.out.println(jan1);
						break;
					case 1:
						String jan2 = "チョキ!";
						System.out.println(jan2);
						break;
					case 2:
						String jan3 = "パー!";
						System.out.println(jan3);
						break;
				}

				if (ran == input) {
					System.out.println("あいこです");
					System.out.println("あいこで");
				} else if (ran + input == 1 && ran > input || ran + input == 2 && ran < input
						|| ran + input == 3 && ran < input) {
					System.out.println("あなたの勝ちです");
					break;
				} else {
					System.out.println("あなたの負けです");
					break;
				}
			}
				System.out.println("もう一度しますか？");
				System.out.println("はい_0、いいえ_1");
				int e = new java.util.Scanner(System.in).nextInt();
				if(e == 1) {
					System.out.println("じゃんけんを終了します");
					break;
			}
		}

	}

}
