package day04;

/**
 * 34.第一个出现一次的字符位置
 * 
 * 在一个字符串(1<=字符串长度<=10000，全部由字母组成) 中找到第一个只出现一次的字符,并返回它的位置.
 * 
 * @author HY
 *
 */
public class Demo34 {

	public static void main(String[] args) {
		String str = "quwqwrr";
		System.out.println(FirstNotRepeatingChar(str));
	}

	public static int FirstNotRepeatingChar(String str) {
		if (str == null)
			return -1;

		if (str.length() == 0)
			return -1;

		char[] cs = str.toCharArray();
		int i;
		for (i = 0; i < cs.length; i++) {
			int num = 0;
			for (int j = 0; j < cs.length; j++) {
				if (cs[i] == cs[j]) {
					num++;
				}
			}
			if (num == 1) {
				break;
			}
		}
		return i;
	}

}
