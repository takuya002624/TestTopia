package code17_11;

public class Person {

	private int age;

	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		if(age < 0) {
			//ここで引数をチェック
			throw new IllegalArgumentException("年齢は0以上の数を指定するべきです。指定値=" + age);
		}
		//問題ないなら、フィールドに値をセット
		this.age = age;
	}
}
