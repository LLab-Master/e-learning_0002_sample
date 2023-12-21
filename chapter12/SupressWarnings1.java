package chapter12;

public class SupressWarnings1 {

	// 未使用の変数に対する警告を無視
	@SuppressWarnings("unused")
	public static String reverseString(String str) {
		char[] chars = str.toCharArray();
		char[] newchars = new char[chars.length];
		int idx = 0;
		int x = 0;
		for (int i = chars.length - 1; i >= 0; i--) {
			newchars[idx++] = chars[i];

		}
		return new String(newchars);
	}

	public static void main(String[] args) {
		String str = "abcd";
		System.out.println(reverseString(str));
	}

}
