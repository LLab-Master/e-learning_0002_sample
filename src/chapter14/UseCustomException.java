package chapter14;

public class UseCustomException {

	public static void main(String[] args) {
		try {
			System.out.println(div(1, 1));
			System.out.println(div(10, 2));
			System.out.println(div(10, 0));
		} catch (CustomException ex) {
			ex.message();
		}

	}

	static int div(int i1, int i2) throws CustomException {
		if (i2 == 0) {
			throw new CustomException();
		}
		return i1 / i2;
	}

}
