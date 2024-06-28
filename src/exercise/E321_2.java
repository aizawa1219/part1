package exercise;

public class E321_2 {

	public static void main(String[] args) {
		Product product = new Product("MT890" , "ステンレスネジ", 280 , false);
		
		System.out.println("商品コード\t=" + product.code());
		System.out.println("商品名\t=" + product.name());
		System.out.println("価格\t=" + product.price());
		System.out.println("欠品\t=" + product.shortage());

	}

}
