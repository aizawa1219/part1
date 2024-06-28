package chapter5_7;

import jp.kwebs.lib.Input;

public class Sample1 {

	public static void main(String[] args) {
		
		String sw;
		do {
			sw = Input.getString("続けますか？（yes=Enter, no=othekey）");
		}while(sw==null);
		
		System.out.println("End");
	}

}
