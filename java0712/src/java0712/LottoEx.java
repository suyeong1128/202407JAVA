package java0712;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoEx {
	public static void main(String[]args) { 
		int [] lotto = new int[6];
		Random rand = new Random();
		Set<Integer> lottoSet = new HashSet<>();
		
		lottoSet.add(1);
		lottoSet.add(1);
		System.out.println(lottoSet.size());
	}
}
