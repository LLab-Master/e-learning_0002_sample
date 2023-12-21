package chapter8;

import java.util.Scanner;

public class Wareki {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("西暦年を入力してください：");
		int year = scan.nextInt();
		toWareki(year);
	}

	static void toWareki(int year) {
		int heisei = year - 1988;
		if (heisei < 0) {
			System.out.println("不正なデータです。");
			return;
		}
		System.out.println(year + "年は" + "平成" + heisei + "年です");
	}

}
