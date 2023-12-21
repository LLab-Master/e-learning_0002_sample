package chapter8;

public class Overload1 {

	public static void main(String[] args) {
		met();
		met(10, 20);
		met(1, 2, 3);
		met(3, "日目");
	}
	// オーバーロード シグネチャの異なる、同名のメソッド
	
	static void met(int i, int j, int k) {
		System.out.println(i + j + k);
	}

	static void met(int i, int j) {
		System.out.println(i + j);
	}

	static void met() {
		System.out.println("引数なし");
	}

	static void met(int i, String j) {
		System.out.println(i + j);
	}

}
