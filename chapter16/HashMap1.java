package chapter16;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("Tanaka", 60);
		map.put("Yamada", 80);
		map.put("Suzuki", 90);
		map.put("Tanaka", 80);
		System.out.println("Tanakaの点数：" + map.get("Tanaka"));
		System.out.println("Yamadaの点数：" + map.get("Yamada"));
		System.out.println("Suzukiの点数：" + map.get("Suzuki"));

	}

}
