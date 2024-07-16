package java0711;

import java.util.Scanner;

public class Exam07 {
	public static void main(String[]args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1. 로그인 | 2. 회원가입 | 3. 예금/출금 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch(menuNum) {
			case 1:
				String ids = "java";
				String pwds = "12345";
				
				System.out.println("로그인 처리");
				System.out.print("아이디 : ");
				String id = scanner.nextLine();
				System.out.print("비밀번호 : ");
				String pwd = scanner.nextLine();
				
				if(ids.equals(id) && pwds.equals(pwd)) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("로그인 실패");
				}
				break;
			case 2:
				System.out.println("회원가입");
				System.out.println("[필수 정보 입력]");
				System.out.print("1. 이름 : ");
				String name = scanner.nextLine();
				System.out.print("2. 주민번호 앞 6자리 : ");
				String ssn = scanner.nextLine();
				System.out.print("전화번호 : ");
				String phone = scanner.nextLine();
				
				System.out.println();
				
				System.out.println("[입력된 내용]");
				System.out.println("1. 이름 : " + name);
				System.out.println("2. 주민번호 앞 6자리 : " + ssn);
				System.out.println("3. 전화번호 : " + phone);
				break;
			case 3:
				System.out.println("예금 출금");
				boolean iorun = true;
				while(iorun) {
					System.out.println("---------------------------------");
					System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
					System.out.println("---------------------------------");
					System.out.print("선택> ");
					int menuNum2 = Integer.parseInt(scanner.nextLine());
					
					switch(menuNum2) {
					case 1:
						System.out.print("예금액> ");
						balance += Integer.parseInt(scanner.nextLine());
						break;
					case 2:
						System.out.print("출금액> ");
						balance -= Integer.parseInt(scanner.nextLine());
						break;
					case 3:
						System.out.print("잔고> ");
						System.out.println(balance);
						break;
					case 4:
						iorun = false;
						break;
					}
					System.out.println();
				}
				System.out.println("예금/출금 프로그램 종료");
				break;
			case 4:
				System.out.println("4");
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
