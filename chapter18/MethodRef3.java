package chapter18;

public class MethodRef3 {

	public static void main(String[] args) {

		String s = "abc";

		FuncInt funcInt = s::indexOf;
		System.out.println(funcInt.get("b"));

	}

}
