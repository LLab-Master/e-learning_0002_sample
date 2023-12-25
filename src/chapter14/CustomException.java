package chapter14;

public class CustomException extends Exception {

	public void message() {
		System.out.println("重大なエラーが発生しました");
	}

}
