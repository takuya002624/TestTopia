package code17_03;

import java.io.FileWriter;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {
		try {
			sub();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void sub() throws IOException {
		subsub();
	}

	public static void subsub() throws IOException {

		FileWriter fw = new FileWriter("text.txt");
	}
}
