package chapter7;

public class ArrayFor2 {

	public static void main(String[] args) {
		int[] arry = { 10, 4, 32, 54, 21 };
		
		// 拡張for文
		//  変数の宣言:配列名
		for (int num : arry) {
			
			// num はループの度に再代入する。
			System.out.println(num); 

		}

	}

}
