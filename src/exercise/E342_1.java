package exercise;

import java.util.ArrayList;

public class E342_1 {

	public static void main(String[] args) {
		var list = new ArrayList<Product>();
		
		list.add(new Product("MT890", "ステンレスネジ", 280, false));
		list.add(new Product("MT810", "タッピングネジ", 160, true));
		list.add(new Product("MT900", "スクリューネジ", 330, true));
		
		for(Product s : list) {
			System.out.println(s.name() + "\t" + s.price());
		}

	}

}
