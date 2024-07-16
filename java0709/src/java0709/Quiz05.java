package java0709;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학점은 : ");
		String input = scan.nextLine();
		int grade = Integer.parseInt(input);
		
		if(grade > 100 || grade < 0) {
			System.out.print("학점은 0~100점 사이로만 입력할 수 있습니다.");
		} else if(grade >= 90) {
			System.out.print("학점은 \'A\'입니다.");
		} else if(grade >= 80) {
			System.out.print("학점은 \'B\'입니다.");
		} else if(grade >= 70) {
			System.out.print("학점은 \'C\'입니다.");
		} else if(grade >= 60) {
			System.out.print("학점은 \'D\'입니다.");
		} else if(grade < 60) {
			System.out.print("학점은 \'F\'입니다.");
		} 
	}
}
