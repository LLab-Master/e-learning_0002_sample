package chapter15;

import static java.lang.Integer.*;
import static java.lang.Math.*;

public class StaticImport {

	public static void main(String[] args) {
		double radius = 4.3;

		// 円の面積を計算
		double m = radius * radius * PI;

		System.out.println(m);

		// 文字列を整数に変換
		int a = parseInt("12");
		System.out.println(a);

	}

}
