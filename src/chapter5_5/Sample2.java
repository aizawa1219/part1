package chapter5_5;

import jp.kwebs.lib.Input;

public class Sample2 {

	public static void main(String[] args) {
		String str;
		while((str = Input.getString()) != null) {
			System.out.println(str);
		}
	}

}
