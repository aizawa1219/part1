package chapter5_5;

import jp.kwebs.lib.Input;

public class Sample1 {

	public static void main(String[] args) {
		
		String str = Input.getString();
		while(str!=null) {
			System.out.println(str);
			str = Input.getString();
		}
	}

}
