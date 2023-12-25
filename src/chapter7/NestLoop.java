package chapter7;

public class NestLoop {

	public static void main(String[] args) {
		int[][] arry = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 }, 
				{ 10, 20, 30 }, 
				{ 40, 50, 60 } 
				};
		
		for (int i = 0; i < arry.length; i++) {

			for (int j = 0; j < arry[i].length; j++) {
				System.out.println(arry[i][j]);
			}
			System.out.println("ネスト");
		}

	}

}
