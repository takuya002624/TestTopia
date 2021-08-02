package code15_05;

public class PlayerName {

	public boolean isValidPlayerName(String name) {

		//文字数が8文字であること
		if (name.length() != 8) {
			return false;
		}

		//最初の文字がA～Zであること
		char first = name.charAt(0);
		if (!(first >= 'A' && first <= 'Z')) {
			return false;
		}

		//以降の文字はA～Zまたは0～9であること
		for (int i = 0; i < 8; i++) {
			char c = name.charAt(i);

			if (!((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
				return false;
			}
		}
		return true;
	}
}
