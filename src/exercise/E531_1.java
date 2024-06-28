package exercise;
//switch式
import jp.kwebs.lib.Input;

public class E531_1 {

	public static void main(String[] args) {
		
		int month = Input.getInt("月");
		String season = switch(month) {
		case	12,1,2	-> "冬";
		case	3,4,5	->	"春";
		case	6,7,8	->	"夏";
		case	9,10,11	->	"秋";
		default			->	"月の値が不正です";
		};
		
		System.out.println(season);
	}

}
