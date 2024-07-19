package p299;

public class ClassName {
	//인스턴스 필드와 메소드
	int field1;
	void method1() {
		ClassName.field2 = 200;
	}
	
	//정적 필드와 메소드
	static int field2;
	static void method2() {
		field2 = 100;
	}
	
	public static void main(String[] args) {
//		method1(); //호출할 수 없음(현재 객체를 생성하지 않았기 때문)
		ClassName.method2();
		System.out.println(ClassName.field2);
		ClassName c1 = new ClassName();
		c1.method1();
		System.out.println(c1.field1);
	}
}
