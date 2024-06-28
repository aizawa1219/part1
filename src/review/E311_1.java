package review;

public class E311_1 {

	public static void main(String[] args) {
		
		double[] data = {0.3, 1.05, 2.2};
		double total = 0.0;
		
		for(double n : data) {
			total += n;
		}
		
		System.out.printf("合計=%.2f \n", total);
		System.out.printf("平均=%.2f" , total/data.length);
		
	}

}
