package code17_03;

import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("hello!");
			fw.close();

			//多態性を使って、例外をザックリキャッチする
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		}


	}

}
