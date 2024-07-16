package java0710;

public class Quiz04 {
	public static void main(String[]args) {
		int i;
		int sum = 0;
		
		for(i = 1; i < 101; i++) {
			if(i % 2 ==0) {
				sum += i;
				continue;
			}
			System.out.println(i);
		}
//		do {
//			System.out.println(i);
//			i++;
//		} while(i >  10);
		System.out.println(sum);
	}
}
