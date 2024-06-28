package exercise;

import jp.kwebs.lib.Input;

public class E411_2 {

	public static void main(String[] args) {
		double weight = Input.getDouble("体重");
		double height = Input.getDouble("身長");
		double value = bmi(weight, height);
		System.out.printf("BMI指数=%.1f", value);
	}
	
	public static double bmi(double w, double h) {
		return w / Math.pow(h/100, 2);
	}

}