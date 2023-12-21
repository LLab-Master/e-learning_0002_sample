package chapter17;

public class SampleThread2 implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 3; i++) {
				Thread.sleep(1000);
				System.out.println("別スレッドの処理です");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
