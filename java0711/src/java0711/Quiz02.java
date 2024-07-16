package java0711;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		do {
			System.out.print("값 입력 : ");
			 a = scan.nextInt();
		} while(a <= 0);
		
		int sum = 0;
		
		for(int i = 1; i <= a; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.", a, sum);
	}
}
