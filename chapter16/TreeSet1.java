package chapter16;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>();

		set.add("Tanaka");
		set.add("Yamada");
		set.add("Suzuki");
		set.add("Yamada");
		
		for (String str : set) {
			System.out.println(str);
		}
	}

}
