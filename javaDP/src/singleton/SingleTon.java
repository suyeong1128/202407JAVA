package singleton;

public class SingleTon {
	private static SingleTon singleTon = new SingleTon();
	private SingleTon() {
		System.out.println("싱글턴 객체 생성!");
	}
	
	public static SingleTon getInstance() {
		return singleTon;
	}
}
