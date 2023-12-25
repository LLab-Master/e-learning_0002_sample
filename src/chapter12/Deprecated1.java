package chapter12;

public class Deprecated1 {

	@Deprecated
	int countString(String str) {
		char[] chars = str.toCharArray();
		int len = 0;
		for (char c : chars) {
			len++;
		}
		return len;
	}

	int newCountString(String str) {
		if (str == null) {
			return 0;
		}
		return str.length();
	}
}
