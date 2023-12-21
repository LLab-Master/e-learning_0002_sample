package chapter18;

public class Lambda1 {

	public static void main(String[] args) {
		Runnable r = () -> {
			try {
				for (int i = 0; i < 10; i++) {
					Thread.sleep(1000);
					System.out.println("wait");

				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		};
		new Thread(r).start();

	}

}
