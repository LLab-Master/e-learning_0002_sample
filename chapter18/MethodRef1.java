package chapter18;

import java.util.function.IntSupplier;

public class MethodRef1 {

	public static void main(String[] args) {

		String s = "abc";

		IntSupplier supplier = s::hashCode;
		System.out.println(supplier.getAsInt());
	}

}
