package answer;

import java.util.Scanner;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的
 * 字符串为We%20Are%20Happy。
 * 
 * @author HY 
 *
 */
public class Mst02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入测试字符串...");
		String str = scanner.nextLine();
		StringBuffer stringBuffer = new StringBuffer(str);
		Mst02 mst02 = new Mst02();
		String result = mst02.replaceSpace(stringBuffer);
		System.out.println(result);
	}
	public String replaceSpace(StringBuffer str) {
		if (str == null) {
			return null;
		}
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i <str.length(); i++) {
			if (str.charAt(i) == ' ') {
				stringBuffer.append("%20");
			}else {
				stringBuffer.append(str.charAt(i));
			}
		}
		return stringBuffer.toString();
	}
}
