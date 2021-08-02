package calcapp.main;

import calcapp.logics.CalcLogic; //インポート文 + FQCN
import calcapp.logics.*; //クラス名を*にすればパッケージの全クラスが使える

public class Calc {
	public static void main(String[] args) {

		int a = 10; int b = 2;
//		int total = calcapp.logics.CalcLogic.tasu(a, b); //完全限定クラス名or完全修飾クラス名(FQCN)
//		int delta = calcapp.logics.CalcLogic.hiku(a, b);
		int total = CalcLogic.tasu(a, b);
		int delta = CalcLogic.hiku(a, b);

		System.out.println("足すと" + total + "、引くと" + delta);

	}
}
