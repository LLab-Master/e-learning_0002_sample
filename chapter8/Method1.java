package chapter8;

public class Method1 {

	public static void main(String[] args) {
		int a = add(3, 4);    // addメソッドを利用
		int b = add(-2, 10);  // addメソッドを利用

		System.out.println(a);
		System.out.println(b);

	}

	static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

}
