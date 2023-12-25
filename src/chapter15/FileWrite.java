package chapter15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter("sample.txt"));
			br.write("あいうえお");
			br.newLine(); // 改行
			br.write("かきくけこ");
			br.flush();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
