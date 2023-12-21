package chapter11;

public class Initalize1 {

	static {
		System.out.println("static初期化ブロック");
	}
	{
		System.out.println("初期化ブロック");
	}

	public Initalize1() {
		System.out.println("コンストラクタ");
	}

	public static void main(String[] args) {
		new Initalize1();
	}

}
