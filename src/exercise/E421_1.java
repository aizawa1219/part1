package exercise;

public class E421_1 {

	public static void main(String[] args) {
		int total = sum(10, 20, 30, 40, 50);
		System.out.println("合計=" + total);
	}
	
	public static int sum(int... num) {
		int total = 0;
			
		for(int n : num) {
			total += n;
		}	
		return total;
		
	}

}
