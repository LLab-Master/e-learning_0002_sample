package chapter14;

import java.util.Scanner;

public class Except1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("点数を入力してください");
		int m = scan.nextInt(); // ユーザーが入力した数値を、変数mに代入

		int[] ary = new int[m]; // 配列（要素数がm個）
		
		for (int i = 0; i < ary.length; i++) {
			ary[i] = i;
		}
		System.out.println(ary[m]); // 配列のインデックスmを表示する。
		scan.close();

		
		System.out.println("次の処理に進んだよ");
		
	}

}
