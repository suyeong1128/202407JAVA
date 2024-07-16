package java0709;

import java.util.Scanner;

public class Quiz04 {
	public static int getNumber(String msg, Scanner sc) {
		System.out.print(msg);
		String input = sc.nextLine();
		return Integer.parseInt(input);
	}
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		int a = getNumber("값1 : ", scan);
//		System.out.print("값1 : ");
//		String var1 = scan.nextLine();
//		int a = Integer.parseInt(var1);
//		
		int b = getNumber("값2 : ", scan);
//		System.out.print("값2 : ");
//		String var2 = scan.nextLine();
//		int b = Integer.parseInt(var2);
//		
		int c = getNumber("값3 : ", scan);
//		System.out.print("값3 : ");
//		String var3 = scan.nextLine();
//		int c = Integer.parseInt(var3);
		
		if(a > b) {
			if(a > c) {
				System.out.printf("값1이 최대값입니다. 값1은 %d", a);
			} else {
				System.out.printf("값3이 최대값입니다. 값3은 %d", c);
			}
		} else if(a < b) {
			if(b > c) {
				System.out.printf("값2가 최대값입니다. 값2는 %d", b);
			}
			else {
				System.out.printf("값3이 최대값입니다. 값3은 %d", c);
			}
		} else {
			System.out.printf("모든 값이 같습니다.");
		}
	}
}
