package chapter4_1;

public class Sample6 {

	public static void main(String[] args) {
		
		double ans1 = Util.menseki(5.5);
		System.out.printf("円の面積 = %.2f%n", ans1);

		double ans2 = Util.menseki(12, 2.5);
		System.out.printf("四角形の面積 = %.2f%n", ans2);
	}

}
