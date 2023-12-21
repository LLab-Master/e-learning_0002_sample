package chapter15;

import java.time.LocalDate;

public class LocalDate1 {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();			// 現在日付
		System.out.println(date1);
		
		LocalDate date2 = LocalDate.of(2000, 2, 1);	//日付を指定
		System.out.println(date2);
		System.out.println(date2.getYear());		// 年
		System.out.println(date2.getMonth());		// 月
		System.out.println(date2.getDayOfYear());	// 日
		System.out.println(date2.getDayOfWeek());	// 曜日	
	}
}
