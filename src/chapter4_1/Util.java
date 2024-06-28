package chapter4_1;
/**
 * ユーティリティクラス
 * <p>
 * 便利なメソッドを集めたクラスです。<br>
 * これかもいろいろなメソッドを追加していく予定です。
 * 
 * @author no1s
 */
public class Util {
	/**
	 * 四角形の面積を計算する
	 * 
	 * @param height	高さ
	 * @param width		幅
	 * @return			四角形の面積
	 */
	public static double menseki(double height, double width) {
		double s = height * width;
		return s;
	}
	
	/**
	 * 円の面積を計算する
	 * 
	 * @param hankei	円の半径
	 * @return			円の面積
	 */
	public static double menseki(double hankei) {
		double s = Math.pow(hankei,  2) * Math.PI;
		return s;
	}
	/**
	 * 体重と身長からBMI指数を計算する
	 * @param weight	体重(kg)
	 * @param height	身長(cm)
	 * @return
	 */
	public static double bmi(double weight, double height) {
		double index = weight / Math.pow(height/100, 2);
		return index;
	}

}
