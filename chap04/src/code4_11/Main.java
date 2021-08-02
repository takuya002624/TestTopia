package code4_11;

public class Main {

	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		int count = 0;
		String[] sub = {"国語", "算数", "理科", "英語", "社会"};
		String subSum = "";

		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= 50) {
				count++; //条件に一致すれば、変数countが１ずつ増える
				subSum += sub[i] + " ";

			}
		}
		System.out.println("50点以上の科目の数は:" + count);
		System.out.println(subSum + "の" + count + "科目である");
	}

}