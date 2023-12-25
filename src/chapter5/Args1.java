package chapter5;

public class Args1 {

	public static void main(String[] args) {

		if (args.length == 2) {
			int i1 = Integer.parseInt(args[0]);
			int i2 = Integer.parseInt(args[1]);
			int sum = i1 + i2;
			System.out.println("合計は" + sum + "です。");
		} else {
			System.out.println("数値が2つ入力されていません");
		}

	}

}
