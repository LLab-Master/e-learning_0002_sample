package chapter16;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("Tanaka", 60);
		map.put("Yamada", 80);
		map.put("Suzuki", 90);

		Set<String> keySet = map.keySet();

		for (String key : keySet) {
			System.out.println(key + "の点数：" + map.get(key));
		}

	}

}
