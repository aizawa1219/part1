package review;

public class E321_1 {

	public static void main(String[] args) {
		
		Product p = new Product("MT890", "ステンレスネジ", 280, false);//インスタンスを作成
		
		System.out.println("商品コード\t= " + p.code());
		System.out.println("商品名\t= "+ p.name());
		System.out.println("価格\t= "+ p.price());
		System.out.println("欠品\t= " + p.shortage());
	}

}
