package java0716;

public class ColorPoint extends Point{
	
	public ColorPoint() {
		super(100, 200); //this()와 마찬가지로 위에 어떤 코드도 허용되지 않기 때문에 가장 위에 있어야함
		System.out.println("자식 기본 생성자 호출");
		System.out.println(x);
		method1();
		
	}
	
	public ColorPoint(int x, int y) {
		super(x,y);
	}

	@Override
	public void method1() {
		System.out.println("자식이 오버라이딩!");
		super.method1(); //super. 생략 가능
	}
	
	
}
