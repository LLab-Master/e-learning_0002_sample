package chapter15;

import java.util.Calendar;

public class Calendar1 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);

		System.out.println(
				"ただ今の時刻：" + year + "年" + month + "月" + day + "日" + " "
		        + hour + "時" + minute + "分" + second + "秒"
		);

	}

}
