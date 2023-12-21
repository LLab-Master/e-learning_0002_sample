package chapter15;

import java.io.File;

public class FileList {

	public static void main(String[] args) {
		File f = new File("src/chapter15");
		String[] list = f.list();

		for (String file : list) {
			System.out.println(file);
		}

	}

}
