package chapter18;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI1 {

	public static void main(String[] args) {

		List<Integer> arry = new ArrayList<Integer>();
		arry.add(540);
		arry.add(20);
		arry.add(30);
		arry.add(490);

		arry.stream().forEach(System.out::println);

	}

}
