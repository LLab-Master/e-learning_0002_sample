package chapter14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except2 {

	public static void main(String[] args) {
		// 例外が発生しうる処理
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("点数を入力してください");
			int m = scan.nextInt();

			int[] ary = new int[m];
			for (int i = 0; i < ary.length; i++) {
				ary[i] = i;
			}
			System.out.println(ary[m]);
			scan.close();


		// 例外「InputMismatchException」が発生した場合の"例外処理"
		} catch (InputMismatchException e) {
			System.out.println("数字では無いデータ入力されました。");
			e.printStackTrace();

		// 例外「ArrayIndexOutOfBoundsException」が発生した場合の"例外処理"
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("配列のアクセス違反です。プログラムに問題があるようです。");
			e.printStackTrace();
		}

		
		System.out.println("次の処理に進んだよ");
		
	}

}
