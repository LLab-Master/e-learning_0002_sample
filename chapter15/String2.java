package chapter15;

public class String2 {

	public static void main(String[] args) {
		String s = "Java";
		String s2 = "𠮟る";
		System.out.println(s.length());
		System.out.println(s2.length());

		System.out.println(s2.codePointCount(0, s2.length()));

	}

}
