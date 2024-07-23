package ramda;

public class Ex5 {

	public static void main(String[] args) {
		MyInterf4 myInterf4 = (a,b) -> a + b;
		int a = myInterf4.method(100, 200);
		System.out.println(a);
	}

}
