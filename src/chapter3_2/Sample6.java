package chapter3_2;

public class Sample6 {

	public static void main(String[] args) {
		Population p = new Population("東京都", 13921, 7.1);//インスタンス作成
		
		System.out.println(p.prefecture());//ゲッターでフィールド表示
		System.out.println(p.population());
		System.out.println(p.rate());

	}

}
