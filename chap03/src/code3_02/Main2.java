package code3_02;

public class Main2 {

	public static void main(String[] args) {
		int age = 20;
		int month = 5;
		if (age >= 18 && month == 5) {
			System.out.println("１８歳以上の５月生まれ");
		}

		String name = "斎藤";
		if (name.equals("斎藤") || name.equals("斉藤")) {
			System.out.println("私は" + name + "です");
		}

		System.out.println("身長を入力してください");
		int height = new java.util.Scanner(System.in).nextInt();
		char size;
		if (height >= 170) {
			size ='L';
		}else if (height >= 155) {
			size = 'M';
		}else if (height >= 140) {
			size = 'S';
		}else {
			size = '?';
		}
		System.out.println("あなたの服は、" + size + "です。");

	}

}
