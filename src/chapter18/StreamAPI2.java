package chapter18;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI2 {

	public static void main(String[] args) {

		List<Integer> arry = new ArrayList<Integer>();
		arry.add(10);
		arry.add(20);
		arry.add(30);
		arry.add(50);

		for (int i : arry) {
			System.out.println(i);
		}

	}

}
