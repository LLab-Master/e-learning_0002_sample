package chapter7;

import java.util.Scanner;

public class BreakSample {

	public static void main(String[] args) {
		int[] arry = { 54, 21, 6, 32, 10 };
		Scanner scan = new Scanner(System.in);
		System.out.print("数字を入力してください；");
		int num = scan.nextInt();
		for (int x : arry) {
			if (x == num) {
				System.out.println(num + "が配列の中にみつかりました");
				break; // ループを完全に抜ける。
			}
			System.out.println(x + " と " +  num + " は、違う数字です");
		}

	}

}
