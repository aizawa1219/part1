package chapter5_3;

import jp.kwebs.lib.Browser;
import jp.kwebs.lib.Input;

public class Sample6 {

	public static void main(String[] args) {
		
		String seiza = Input.getString("星座（ひらがな）");
		
		String fname = switch(seiza) {	//式の値を変数fnameに代入する
		case	"おひつじざ"	-> "aries";
		case	"おうしざ"	->"taurus";
		case	"ふたござ"	-> "gemini";
		case	"かにざ"	-> "cancer";
		case	"ししざ"	->  "leo";
		case	"おとめざ"	-> "virgo";
		case	"てんびんざ"	-> "libra";
		case	"さそりざ"	-> "scorpio";
		case	"いてざ"	-> "sagittarius";
		case	"やぎざ"	-> "capricorn";
		case	"みずがめざ"	-> "aquarius";
		case	"うおざ"	-> "pisces";
		default		->{
			System.out.println("入力エラーです");
			yield "index";
		}
		};
		
		String url = "https://www.asahi.com/uranai/12seiza/";
		Browser.openWindow(url + fname +".html");
	}

}
