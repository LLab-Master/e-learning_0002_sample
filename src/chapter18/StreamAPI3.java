package chapter18;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamAPI3 {

	public static void main(String[] args) {
		String[] values = { "apple", "orange", "banana", "peach", "lemon", "mango" };
		Stream<String> stream = Arrays.stream(values);

		stream.filter(value -> value.contains("a"))
         .forEach(value -> System.out.println(value));

	}

}
