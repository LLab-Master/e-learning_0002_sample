package chapter18;

import java.util.function.IntSupplier;

public class MethodRef2 {

	public static void main(String[] args) {

		String s = "abc";

		IntSupplier supplier = new IntSupplier() {

			@Override
			public int getAsInt() {
				return s.hashCode();
			}
		};
		System.out.println(supplier.getAsInt());
	}

}
