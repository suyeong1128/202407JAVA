package java0711;

import java.util.Scanner;

public class Quiz01 {
	public static int med(int a, int b, int c) {
		if((b>= a && c <= a) || (b <= a && c >= a)) {
			return a;
		} else if ((a >= b && c <= b) || (c >= b && b <= a)) {
			return b;
		} else {
			return c;
		}
		
//		if(a > b) {
//			if(b > c) {
//				return b;
//			} else if(a < c) {
//				return a;
//			} else {
//				return c;
//			}
//		} else if(a > c) {
//				return a;
//		} else if(b > c) {
//				return c;
//		} else {
//			return b;
//		}
	}
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("값1 입력 : ");
		String str1 = scan.nextLine();
		int a = Integer.parseInt(str1);
		
		System.out.print("값2 입력 : ");
		String str2 = scan.nextLine();
		int b = Integer.parseInt(str2);
		
		System.out.print("값3 입력 : ");
		String str3 = scan.nextLine();
		int c = Integer.parseInt(str3);
		
		System.out.printf("세 수의 중앙값은 %d입니다", med(a,b,c));
		
//		if(a > b) {
//			if(b > c) {
//				System.out.printf("세 수의 중앙값은 %d입니다.", b);
//			} else if(a < c) {
//				System.out.printf("세 수의 중앙값은 %d입니다.", a);
//			} else {
//				System.out.printf("세 수의 중앙값은 %d입니다.", c);
//			}
//		} else if(a > c) {
//				System.out.printf("세 수의 중앙값은 %d입니다.", a);
//		} else if(b > c) {
//				System.out.printf("세 수의 중앙값은 %d입니다.", c);
//		} else {
//			System.out.println(b);
//		}
	}
}
