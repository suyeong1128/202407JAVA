package java0713;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {
	
	public static void main(String[]args) {
		ArrayList<String> list;
		list = new ArrayList<String>();
//		ArrayList<String> list2 = new ArrayList<String>(); 선언 시점과 생성 시점을 다르게 하고 싶다면 분리해서 사용
//		ArrayList<String> list3 = new ArrayList<>();
//		List<String> list4 = new ArrayList<String>();
		
		list.add("홍길동");
		list.add("자바");
		list.add("Hello");
		
//		이터레이터 (자바 디자인 패턴)
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
//		for(String str : list) {
//			System.out.println(str);
//		}
		
		
	}
}
