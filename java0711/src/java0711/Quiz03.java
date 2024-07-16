package java0711;

import java.util.Scanner;

public class Quiz03 {
	public static int sumOf(int a, int b) {
		int min;
		int max;
		int sum = 0;
		
		if(a < b) {
			min = a; max = b;
		} else {
			min = b; max = a;
		}
		
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("값1 입력 : ");
		int a = scan.nextInt();
		
		System.out.print("값2 입력 : ");
		int b = scan.nextInt();
		
		System.out.printf("정수 a와 정수 b를 포함한 두 사이에 합은 %d입니다.", sumOf(a,b));
	}
}
