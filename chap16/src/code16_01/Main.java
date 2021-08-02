package code16_01;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		//Integer型でArrayListを宣言
		ArrayList<Integer> points = new ArrayList</*Ineger*/>();

		//自動的にIntegerに変換・格納される
		points.add(10);
		points.add(80);
		points.add(75);

		//拡張for文も利用可能(int型に自動変換)
		for(int i : points) {
			System.out.println(i);
		}
	}

}
