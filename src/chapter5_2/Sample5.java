package chapter5_2;

public class Sample5 {

	public static void main(String[] args) {
		
		double value = Math.random();
		if(value>=0.9) {
			System.out.println("大吉");
		}else if(value>=0.7) {
			System.out.println("中吉");
		}else if (value>=0.5) {
			System.out.println("小吉");
		}else {
			System.out.println("吉");
		}
	}

}
