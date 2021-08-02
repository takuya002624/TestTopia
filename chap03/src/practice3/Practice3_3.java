package practice3;

public class Practice3_3 {

	public static void main(String[] args) {
		int isHungry = 1;
		String food = "バナナ"; //食べ物

		System.out.println("こんにちは");

		if(isHungry == 0) { //isHungryが0の場合
			System.out.println("お腹がいっぱいです");
		}else { //isHungryがそれ以外の場合
			System.out.println("はらぺこです");
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");

	}

}
