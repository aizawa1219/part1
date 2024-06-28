package exercise;

import jp.kwebs.lib.Input;

public class E531_2 {

	public static void main(String[] args) {
		
		
		int month = Input.getInt("月");
		switch(month) {
		case	12,1,2	-> System.out.println("冬");
		case	3,4,5	->	System.out.println("春");
		case	6,7,8	->	System.out.println("夏");
		case	9,10,11	->	System.out.println("秋");
		default			->	System.out.println("月の値が不正です");
		}
		
	}

}
