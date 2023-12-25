package chapter16;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("東京");
		list.add("大阪");
		list.add("名古屋");
		list.add("横浜");
		list.add("福岡");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("--------------");
		// 拡張for
		for (String str : list) {
			System.out.println(str);
		}

	}

}
