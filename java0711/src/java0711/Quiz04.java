package java0711;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		System.out.println("1부터 n까지의 합과 그 과정을 출력하는 프로그램");
		System.out.print("n값 입력 : ");
		int n = scan.nextInt();

//내가 한 코드
		for(int i = 1; i <= n; i++) {
			sum += i;
			if(i < n) {
				System.out.printf("%d + ", i);
			}
		}
		System.out.printf("%d = %d", n, sum);

//강사님이 하신 코드
//		for(int i = 1; i <= n; i++) {
//			if(i < n) {
//				System.out.print(i + "+");
//			} else {
//				System.out.print(i + "=");
//			}
//			sum += i;
//		}
//		System.out.println(sum);
//강사님이 하신 코드2		
//		for(int i = 1; i < n; i++) {
//			System.out.print(i + " + ");
//			sum += i;
//		}
//		
//		System.out.print(n + " = ");
//		sum += n;
//		System.out.println(sum);
	}
}
