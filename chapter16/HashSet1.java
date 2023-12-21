package chapter16;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();

		set.add("Tanaka");
		set.add("Yamada");
		set.add("Suzuki");
		set.add("Yamada");

		for (String str : set) {
			System.out.println(str);
		}
	}

}
