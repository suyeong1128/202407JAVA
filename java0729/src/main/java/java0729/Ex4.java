package java0729;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Ex4 {
	public static void main(String[]args) {
		Date now = new Date(); //스레드 사용시 비추
		System.out.println(now);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); //스레드 사용시 비추
		String strNow = sdf.format(now);
		System.out.println(strNow);
		
		LocalDateTime now1 = LocalDateTime.now();
		String strNow1 = DateTimeFormatter.ofPattern("yyyy/MM/dd").format(now1);
		System.out.println(now1);
		
		//LocalDateTime은 SimpleDateFormat으로 초기화할 수 없음
//		LocalDateTime now2 = LocalDateTime.now();
//		String strNow2 = sdf.format(now2);
//		System.out.println(strNow1);
	}
}
