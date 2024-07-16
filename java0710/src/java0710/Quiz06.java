package java0710;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단 입력 : ");
		String str = scan.nextLine();
		int i = Integer.parseInt(str);
		int k;
		
		for(k = 1; k < 10; k++) {
			System.out.println(i + "X" + k + "=" + i * k);
		}
	}
}
