package test_practice;

/**
 * 特別会員かを判定するクラス
 * @author sakumasumitaka
 *
 */
public class RegisterCheck {

	public static void main(String[] args) {

		// 年齢
		int age = 0;
		// メールマガジンに登録しているかのフラグ
		boolean isRegisterMailMagazine = false;
		// 前月の利用回数
		int userPastMonth = 0;

		// 特別会員かの判定メソッド
		isSpecialMember(age, isRegisterMailMagazine, userPastMonth);
	}

	public static boolean isSpecialMember(int age, boolean isRegisterMailMagazine, int userPastMonth) {

		// 20歳未満、150歳以上は特別会員でない
		if ((age < 20) || (150 <= age)) {
			return false;
		}
		// メールマガジンに登録してない場合、特別会員でない
		if (!isRegisterMailMagazine) {
			return false;
		}
		// 前月1回も利用してない場合、特別会員でない
		if (userPastMonth < 1) {
			return false;
		}
		return true;
	}
}
