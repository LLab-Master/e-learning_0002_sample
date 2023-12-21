package chapter4;

public class Operator1 {

	public static void main(String[] args) {
		int a = 14;
		int b = 4;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		/* 
		   下記の計算結果は小数点以下が切り捨てられるので、
		   次行の通りに書き換えて確認する。
		 */
		System.out.println(a / b);
//		System.out.println(a / (double)b);
		System.out.println(a % b);

	}

}
