package chapter17;

public class UseSampleThread2 {

	public static void main(String[] args) {
		try {
			Thread st = new Thread(new SampleThread2());
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
