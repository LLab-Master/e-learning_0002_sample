package chapter4;

public class Variable1 {

	public static void main(String[] args) {
		int i = 100_00;
		double d = 12.34;
		float f = 21.23f;
		long l = 1000000000000L;
		char c = 'あ';

		System.out.println(i);
		System.out.println(d);
		System.out.println(f);
		System.out.println(l);
		System.out.println(c);

		i = 300;
		c = 'い';
		System.out.println(i);
		System.out.println(c);

	}

}
