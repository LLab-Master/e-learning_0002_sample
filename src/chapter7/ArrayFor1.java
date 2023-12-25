package chapter7;

public class ArrayFor1 {

	public static void main(String[] args) {
		
		int[] arry = { 10, 4, 32, 54, 21 };
		
			// 条件式に、配列のインデックス（要素数）
		for (int i = 0; i < arry.length; i++) {
			
			// "ループ変数" を "配列のインデックス"に利用
			System.out.println(arry[i]);
			
		}
	}

}
