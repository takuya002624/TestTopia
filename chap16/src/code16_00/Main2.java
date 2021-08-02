package code16_00;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {

		Person p = new Person();

		p.setName("太郎");

		List<Person> list = new ArrayList<>();

		list.add(p);

		p.setName("花子");

		System.out.println(list.get(0).getName());
	}

}
