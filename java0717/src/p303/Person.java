package p303;

public class Person {
	final String nation = "Korea";
	static final double PI = 3.141592;
	
	public static void main(String[]args) {
		Person p1 = new Person();
//		p1.nation = "USA"; //nation이 final필드이기 때문에 값을 수정할 수 없다.
//		PI = 3.14;
		System.out.println(p1.nation);
	}
}
