package exercise;

import jp.kwebs.lib.Input;

public class E551_1 {

	public static void main(String[] args) {
		String str;
		String buffer = "";
		while((str = Input.getString()) != null) {
			buffer += str;
		}
		System.out.println(buffer);
	}

}
