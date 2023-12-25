package chapter7;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int num;
		System.out.print("数値を入力してください：");
		
		while ((num = scan.nextInt()) != 0) {
			sum += num;
			System.out.print("数値を入力してください：");
		}
		
		System.out.println("入力された数値の合計は" + sum + "です");
		
	}

}
