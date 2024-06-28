package chapter5_6;

import java.util.List;

public class Sample2 {

	public static void main(String[] args) {
		
		var number = List.of(150,88,91,-27,55);
		for (int n : number) {
			if(n<0) {
				continue;
			}
			System.out.print(n + "\t");
		}
	}

}
