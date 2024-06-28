package exercise;

import jp.kwebs.lib.Input;

public class E511_2 {

	public static void main(String[] args) {
		String str = Input.getString();
		String msg = str.equals("OK")? "おめでとう" : "残念";
		System.out.println(msg);
	}

}
