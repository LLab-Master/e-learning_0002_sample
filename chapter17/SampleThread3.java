package chapter17;

class Thread1 extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("集計処理1を実行中…");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Thread2 implements Runnable {
	@Override
	public void run() {
		try {
			System.out.println("集計処理2を実行中…");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class SampleThread3 {
	public static void main(String[] args) {
		try {
			Thread1 th1 = new Thread1();
			Thread th2 = new Thread(new Thread2());
			th1.start();
			th2.start();
			// 2つのスレッドが終わるの待つ
			th1.join();
			th2.join();
			System.out.println("全体の処理が完了しました");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
