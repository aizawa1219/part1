package exercise;
import jp.kwebs.lib.Input;
public class E281_1 {

	public static void main(String[] args) {
		double a = Input.getDouble("a"); //doubleの値を入力
		double b = Input.getDouble("b"); //doubleの値を入力
		
		System.out.println(a + "の" + b + "乗は" + Math.pow(a, b) + "です");

	}

}
