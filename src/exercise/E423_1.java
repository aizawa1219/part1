package exercise;

import java.util.List;

public class E423_1 {

	public static void main(String[] args) {
		var list = getList();
		
		for (Product p : list) {
			System.out.println(p.name() + "\t" + p.price());
		}
	}
	
	public static List<Product> getList(){
		var list = List.of(
				new Product("MT890", "ステンレスネジ", 280, false),
				new Product("MT810", "タッピングネジ", 160, true),
				new Product("MT900", "スクリューネジ", 330, true));
		
		return list;
	}

}
