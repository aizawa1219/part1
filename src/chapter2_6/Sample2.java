package chapter2_6;

public class Sample2 {

	public static void main(String[] args) {
		int ans, num=10;
		System.out.println(num);
		ans = num++;
		System.out.println(ans);
		System.out.println(num);
		
		ans = 0;
		num = 10;
		ans = ++num;
		System.out.println(ans);
		System.out.println(num);

	}

}
