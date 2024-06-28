package exercise;

import jp.kwebs.lib.Input;

public class E521_3 {

	public static void main(String[] args) {
		
		int month = Input.getInt("月");
		
		if (month<1 || month>12) {
			System.out.println("月の値が不正です");
		}else if(month==12 || month<=2) {
			System.out.println("冬");
		}else if(month<=5) {
			System.out.println("春");
		}else if(month<=8) {
			System.out.println("夏");
		}else {
			System.out.println("秋");
		}
	}

}
