package exercise;

import jp.kwebs.lib.Input;

public class E521_1 {

	public static void main(String[] args) {
		
		int num = Input.getInt("人数");
		int money = num * 1000;
		
		if (num>=5) {
			money *= 0.7;
		}
		System.out.printf("%,d円", money); //,はコンマで区切る。dは整数型。2
	}

}
