package chapter17;

public class UseSampleThread1 {

	public static void main(String[] args) {
		try {
			SampleThread1 st = new SampleThread1();
			st.start();

			for (int i = 0; i < 5; i++) {
				Thread.sleep(1500);
				System.out.println("こちらはメインメソッドです");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
