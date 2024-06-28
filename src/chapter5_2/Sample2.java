package chapter5_2;

import jp.kwebs.lib.Input;

public class Sample2 {

	public static void main(String[] args) {
		
		String word = Input.getString();
		if(word.equals("cat")) {
			System.out.println("大当たり");
		}
	}

}
