package chapter5;

public class Array3 {

	public static void main(String[] args) {
		int[] a = {0,1,2,3,4};
		int[] b;

		b = a; // 配列同士の代入
		System.out.println("a[2]=" + a[2]);
		System.out.println("b[2]=" + b[2]);

		b[2] = 99; // 配列bのインデックス[2]を、再代入
		System.out.println("a[2]=" + a[2]);
		System.out.println("b[2]=" + b[2]);

	}

}
