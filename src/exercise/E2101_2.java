package exercise;

public class E2101_2 {

	public static void main(String[] args) {
		String msg ="""
				"番号":%d
				"氏名":"%s"
				"得点":%d
				""";
		
		System.out.println(msg.formatted(12345,"田中宏",90));

	}

}
