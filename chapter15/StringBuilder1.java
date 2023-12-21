package chapter15;

public class StringBuilder1 {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("AABC"); // 追加
		builder.append("DEF"); // 追加
		builder.deleteCharAt(0); // 削除

		String s = builder.toString();
		System.out.println(s);

	}

}
