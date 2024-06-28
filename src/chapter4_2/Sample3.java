package chapter4_2;

import java.util.List;

public class Sample3 {

	public static void main(String[] args) {
		var list = List.of("one", "two", "three");
		message(list);
	}
	
	public static void message(List<String> list) {
		for(String n : list) {
			System.out.print(n + " ");
		}
	}

}
