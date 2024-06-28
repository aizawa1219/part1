package exercise;

import java.util.List;

public class E561_2 {

	public record Score (String name, int score) {}
	public static void main(String[] args) {
		var score = List.of(
				new Score("田中", 85),
				new Score("鈴木", 66),
				new Score("斎藤", 82),
				new Score("木村", 57),
				new Score("山下", 77));
		
		for (Score s : score) {  //Score型の変数s
			if(s.score() < 60) {
				break;
			}
			System.out.println(s);
		}
		
		System.out.println("60点未満です");
	}

}
