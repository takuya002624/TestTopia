package practice15_9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main2 {

	public static void main(String[] args) {

		LocalDate l1 = LocalDate.now();
		LocalDate l2 =l1.plusDays(100);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");

		System.out.println(l2.format(dtf));

	}

}
