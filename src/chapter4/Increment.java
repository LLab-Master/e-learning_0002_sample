package chapter4;

public class Increment {

	public static void main(String[] args) {
		int a;
		int b;

		a = 10;
		b = ++a;
		System.out.println("前置き");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a = 10;
		b = a++;
		System.out.println("後置き");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
