package exercise;

import jp.kwebs.lib.Input;

public class E531_3 {

	public static void main(String[] args) {
		
		String code = Input.getString("商品コード");
		int tanka = switch(code) {
		case "a100"	->	100;
		case "a110"	->	200;
		case "b100"	->	100;
		case "b110"	->	210;
		case "b120"	->	250;
		case "c100"	->	200;
		case "c110"	->	210;
		case "d100"	->	100;
		default		->	{
			System.out.println("商品コードが間違っています");
			yield 0;
		}
		};
		
		if(tanka != 0) {
			int n = Input.getInt("個数");
			int gaku = tanka * n;
			System.out.println("合計金額=" + gaku);
		}
	}

}
