package java0709;

/**
 * 장수영
 */
public class Quiz01 {
	/**
	 * @param a
	 * @param b
	 */
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
//		System.out.println("x = " + x);
//		System.out.println("y = " + y);
		System.out.printf("x = %d, y = %d", a, b);
	}
	/**
	 * @param args
	 */
	public static void main(String[]args) {
		int x = 10; 
		int y = 20;
//		System.out.println("x = " + x);
//		System.out.println("y = " + y);
		System.out.printf("x = %d, y = %d%n", x, y);
		
		System.out.println("Swapping 후");
		
		swap(x,y);
//		temp = x;
//		x = y;
//		y = temp;
////		System.out.println("x = " + x);
////		System.out.println("y = " + y);
//		System.out.printf("x = %d, y = %d", x, y);
	}
}
