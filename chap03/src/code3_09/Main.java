package code3_09;

public class Main {

	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) { //変数i は1＿9の繰り返し
			System.out.println(i + "の段！");
			for(int j = 1; j < 10; j++) { //変数j は1＿9の繰り返し
				System.out.print(i * j); //改行をしないため println じゃなく、print
				System.out.print(" \t"); //空白を入力　スペースが入っている
			}
			System.out.println(""); //改行を入力 jが９まで終わったので、iに１を足して繰り返し
		}

	}

}
