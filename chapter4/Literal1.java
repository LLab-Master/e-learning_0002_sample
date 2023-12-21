package chapter4;

public class Literal1 {

	public static void main(String[] args) {
		// 様々なリテラル
		// 整数リテラル
		System.out.println(252); // 10進数
		System.out.println(0377); // 8進数
		System.out.println(0xff); // 16進数
		System.out.println(0b11011); // 2進数

		// 浮動小数点リテラル
		System.out.println(12.33); // 10進数
		System.out.println(3e4); // 指数表記

		// 文字リテラル
		System.out.println('A'); // 1文字
		System.out.println('\u3012'); // Unicode

		// 文字列リテラル
		System.out.println("Hello"); // 文字列
		System.out.println(true); // 真偽

	}

}
