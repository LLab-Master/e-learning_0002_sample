package chapter7;

public class ContinueSample {

	public static void main(String[] args) {
		for (int i = 1; i <= 30; i++) {
			if (i % 3 != 0) {
				
				continue;
				/*
				 ループ内の以降の処理をスキップして、
				 次回のループに入る
				 */ 
			}
			System.out.println(i);
		}

	}

}
