package chapter18;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamAPI4 {

	public static void main(String[] args) {

		int[] arry = { 10, 30, 54, 33, 75 };
		IntStream stream = Arrays.stream(arry);
		int sum = stream.sum();

		System.out.println(sum);

	}

}
