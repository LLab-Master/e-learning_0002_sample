package chapter16;

import java.util.ArrayList;

public class Array1 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		int sum = 0;
		for (int i : list) {
			sum += i;
			System.out.println(i);
		}

		System.out.println("合計は" + sum + "です");

	}

}
