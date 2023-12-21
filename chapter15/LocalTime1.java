package chapter15;

import java.time.LocalDateTime;

public class LocalTime1 {

	public static void main(String[] args) {
		LocalDateTime date1 = LocalDateTime.now();			// 現在日付
		System.out.println(date1);
		
		LocalDateTime date2 = LocalDateTime.of(2000, 1, 1, 2, 30, 15, 123456789);	//時刻を指定
																	// 終わりの引数２つ(秒, ナノ秒) は適宜省略可
		System.out.println(date2.getYear());			// 年
		System.out.println(date2.getMonth());			// 月
		System.out.println(date2.getDayOfMonth());		// 日
		System.out.println(date2.getDayOfWeek());		// 曜日	
		System.out.println(date2.getHour());			// 時	
		System.out.println(date2.getMinute());			// 分	
		System.out.println(date2.getSecond());			// 秒	
		System.out.println(date2.getNano());			// ナノ秒	
	}

}
