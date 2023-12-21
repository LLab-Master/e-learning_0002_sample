package chapter18;

public class InnerClass1 {

	public static void main(String[] args) {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					for (int i = 0; i < 10; i++) {
						Thread.sleep(1000);
						System.out.println("Test");

					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		};
		new Thread(r).start();

	}

}
