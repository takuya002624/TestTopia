package code1_5;

public class Main {
	public static void main(String[] args) {
		final double PI = 3.14; //定数で円周率を宣言
		int pie = 5; //半径に5を代入して宣言

		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
		System.out.println("パイの半径を倍にします");

//		PI = 10; //円周率に代入してしまっている
		pie = 10; //半径に10を再度代入

		System.out.println("半径" + pie + "㎝のパイの面積は、");
		System.out.println(pie * pie * PI);

	}

}
