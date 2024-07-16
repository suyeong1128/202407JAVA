package java0709;

import java.util.Scanner;

public class Quiz02 {
	public static int getCount(String msg, Scanner sc) {
		System.out.print(msg);
		String input = sc.nextLine();
		return Integer.parseInt(input);
	}
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		int apple = getCount("사과의 개수 입력 : ", scanner);
		
//		System.out.print("사과의 개수 입력 : ");
//		String input = scanner.nextLine();
//		int apple = Integer.parseInt(input);
		
		int people = getCount("친구 명수 입력 : ", scanner);
//		System.out.print("친구 명수 입력 : ");
//		input = scanner.nextLine();
//		int people = Integer.parseInt(input);
		int remainder =  apple % (people + 1);
		System.out.printf("남은 사과의 개수 : %d\n", remainder);
	}
}
