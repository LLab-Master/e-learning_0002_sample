package chapter14;

public class UseCustomException2 {

	public static void main(String[] args) {
		System.out.println(div(1, 1));
		System.out.println(div(10, 2));
		System.out.println(div(10, 0));
	}

	static String div(int i1, int i2){
		try {
			if (i2 == 0) {
				throw new CustomException();
			}
			return "OK";
			
		} catch (CustomException ex) {
			ex.message();
			return "OUT";
		}
	}

}
