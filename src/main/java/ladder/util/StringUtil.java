package ladder.util;

/**
 * Created by seungwoo.song on 2022-10-24
 */
public class StringUtil {

	public static final String EMPTY_MARK = " ";

	private StringUtil() {
	}

	public static boolean isNotBlank(String result) {
		return result != null && !result.isEmpty();
	}

	public static String lpad(String text, int maxLength) {
		return StringUtil.getMarks(maxLength - text.length(), EMPTY_MARK) + text;
	}

	public static String lpad(String text, int maxLength, String emptyMark) {
		return StringUtil.getMarks(maxLength - text.length(), emptyMark) + text;
	}

	public static String getMarks(int cnt, String mark) {
		String result = "";
		for (int i = 0; i < cnt; i++) {
			result += mark;
		}

		return result;
	}
}
