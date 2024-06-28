package exercise;

import jp.kwebs.lib.Input;

public class E521_2 {

	public static void main(String[] args) {
		
		int year = Input.getInt("西暦年");
		
		if((year%4==0 && year%100!=0) || year%400==0) {
			System.out.println("うるう年です");
		}else {
			System.out.println("うるう年ではありません");
		}
	}

}
