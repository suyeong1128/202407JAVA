package java0710;

import java.util.Scanner;

public class Prod04 {
	public static int maxNum(int x, int y, int z) {
		int max = x;
		
		if(y > max) {
			y = max;
		}
		if(z > max) {
			z = max;
		}
		
		return max;
	}
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("3개의 수를 입력 :");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println(maxNum(a,b,c));
	}
}
