package chapter17;

public class SampleThread1 extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 3; i++) {
				Thread.sleep(1000);
				System.out.println("別スレッドの処理です");
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
