package exercise;

import jp.kwebs.lib.Input;

public class E541_1 {

	public static void main(String[] args) {
		
		int goke = 0;
		for(int i=0; i<5; i++) {
			
			int n = Input.getInt("整数");
			goke += n;
		}
		System.out.println("合計=" + goke);
	}

}
