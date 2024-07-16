package java0711;

public class Max {
	public static void main(String[]args) {
		int a[] = {13, 35, 12, 27, 8};
		
		int max = a[0];
		
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.printf("배열의 최대값은 %d입니다.", max);
	}
}
