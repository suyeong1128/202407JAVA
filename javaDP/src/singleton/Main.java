package singleton;

public class Main {
	
	public static void main(String[]args) {
		SingleTon obj1 = SingleTon.getInstance();
		SingleTon obj2 = SingleTon.getInstance();
		if(obj1 == obj2) {
			System.out.println("obj1과 obj2는 같은 인스턴스입니다.");
		} else {
			System.out.println("obj1과 obj2는 같은 인스턴스가 아닙니다.");
		}
	}
}
