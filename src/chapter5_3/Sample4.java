package chapter5_3;

import jp.kwebs.lib.Input;

public class Sample4 {

	public static void main(String[] args) {
		
		int s = Input.getInt();
		String msg = switch( s ) {
		case	100	-> "正常終了";
		case	200,201	->	"ページが存在しない";
		default			->	"内部エラー";
		};
		System.out.println(msg);
	}

}
