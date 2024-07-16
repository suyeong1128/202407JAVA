package java0711;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.println("n값을 입력 받아 +, - 기호를 번걸아가며 출력한는 프로그램");
		do {
			System.out.print("n값 입력 : ");
			n = scan.nextInt();
		}while (n <= 0);
//내가 한 코드		
		for(int i=1; i <= n; i++) {
			if(i % 2 == 1) {
				System.out.print("+");
			} else {
				System.out.print("-");
			}
		}
//강사님이 하신 코드
//		for(int i = 0; i < n; i++) {
//			if(i % 2 == 0) {
//				System.out.print("+");
//			} else {
//				System.out.print("-");
//			}
//		}
//강사님이 하신 코드2		
//		for(int i = 0; i < n/2; i++) {
//			System.out.print("+-");
//		}
//		if(n % n != 0) { //n값이 홀수이면
//			System.out.print("+");
//		}
	}
}
