package java0725;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayEx3 {
	public static void main(String[]args) {
		int [] array = {1, 1, 4, 5, 7, 8, 11, 12, 17, 21, 24};
		int found = Arrays.binarySearch(array, 5); //binarySearch는 정렬이 된 상태에서만 가능
		System.out.println(found);
	}
}
