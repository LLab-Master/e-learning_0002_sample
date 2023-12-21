package chapter6;

public class If02 {

	public static void main(String[] args) {
		int amount = 3420; // 合計金額
		int num = 5; // 数量

		if (amount >= 3000 && num >= 10) {
			System.out.println("ポイント10倍です");
		} else {
			System.out.println("通常のポイントです");
		}

	}

}
