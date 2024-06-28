package exercise;

import jp.kwebs.lib.Input;

public class E551_2 {

	public static void main(String[] args) {
		
		int total = 0,number;
		while((number = Input.getInt())!= 0) {
			total += number;
		}
		
		System.out.println("合計=" + total);
	}

}
