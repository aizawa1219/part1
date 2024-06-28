package exercise;
import jp.kwebs.lib.Input;
public class E291_1 {

	public static void main(String[] args) {
		
		String str = Input.getString("お名前");  //文字列を入力
		
		System.out.println(str.equals("abc")); //文字列の引数を同じかどうか
		System.out.println(str.length()); //長さ
		System.out.println(str.replace("a", "xxx")); //aをxxxに置き換え

	}

}
