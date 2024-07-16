package java0711;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n,w;
		System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력해라");
		do {
			System.out.print("n값 입력 : ");
			n = scan.nextInt();
		} while(n <= 0);
		
		do {
			System.out.print("w값 입력 : ");
			w = scan.nextInt();
		} while(w <= 0 || w > n);
//강사님이 하신 코드(나는 못풀었음)
//		for(int i = 0; i < n; i++) {
//			System.out.print("*");
//			if(i % w == w-1) {
//				System.out.println();
//			}
//		}
//		if(n % w != 0) {
//			System.out.println();
//		}
//		System.out.println();
//강사님이 하신 코드2		
		for (int i = 0; i < n / w; i++) {
			System.out.println("*".repeat(w));
		}
		int rest = n % w;
		if(rest != 0) {
			System.out.println("*".repeat(rest));
		}
		System.out.println("완료!!");
	}
}
