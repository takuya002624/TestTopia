package practice17_9_1;

public class Main {

	public static void main(String[] args) {

		String s = null;
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("－－スタックトレース(ここから)－－");
			e.printStackTrace();
			System.out.println("－－スタックトレース(ここまで)－－");
		}
	}

}
