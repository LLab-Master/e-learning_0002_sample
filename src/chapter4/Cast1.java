package chapter4;

public class Cast1 {

	public static void main(String[] args) {

		int i    = 10;
		long l   = i; // 暗黙的型変換
		double d = l; // 暗黙的型変換


		int num1    = 10;
		double num2 = 2.5;
		double sum = num1 + num2; // 暗黙的型変換


		double data;

		data = sum;      //12.5
		l = (long) data; // 明示的型変換


		data = 10000000000L;
		i = (int) data; // 明示的型変換


		System.out.println(sum);
		System.out.println(d);
		d = 3.14;
		l = (long) d; // 明示的型変換
		System.out.println(l);
		l = 10000000000L;
		i = (int) l; // 明示的型変換
		System.out.println(i); // 元データが消失

	}

}
