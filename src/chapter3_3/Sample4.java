package chapter3_3;

import java.util.List;

public class Sample4 {

	public static void main(String[] args) {
		
		var list =List.of(8, 15, 21, 10, 7);
		int total = 0;
		
		for(int n : list) {
			total += n;
		}
		
		System.out.println("合計=" + total);
		System.out.println(list);

	}

}
