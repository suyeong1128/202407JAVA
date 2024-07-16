package java0709;

import java.util.Scanner;

public class Quiz03 {
	public static int getNumber(String msg, Scanner sc) {
		System.out.print(msg);
		String input = sc.nextLine();
		return Integer.parseInt(input);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = getNumber("값1 : ", scan);
//		System.out.print("값1 : ");
//		String str1 = scan.nextLine();
//		int a = Integer.parseInt(str1);

		int b = getNumber("값2 : ", scan);
//		System.out.print("값2 : ");
//		String str2 = scan.nextLine();
//		int b = Integer.parseInt(str2);
		
		if(a > b) {
			System.out.printf("값1이 더 큽니다. 값1은 %d",a);
		} else if(a < b) {
			System.out.printf("값2가 더 큽니다. 값2는 %d", b);
		}else {
			System.out.println("값이 같습니다.");
		}
	}
}
