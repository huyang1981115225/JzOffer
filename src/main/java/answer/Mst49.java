package answer;

import java.util.Scanner;

/**
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
 * 数值为0或者字符串不是一个合法的数值则返回0 
 * 
 * 输入描述:
 * 输入一个字符串,包括数字字母符号,可以为空 
 * 
 * 输出描述: 
 * 如果是合法的数值表达则返回该数字，否则返回0
 * 
 * @author HY
 * 
 */
public class Mst49 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符串...");
		String str = scanner.nextLine();
		Mst49 mst49 = new Mst49();
		int result = mst49.StrToInt(str);
		System.out.println(result);
	}
	public int StrToInt(String str) {
		int result;
		if (str .equals("") ) {
			return 0;
		}
		if (str.length() == 0) {
			return 0;
		}
		try {
			 result = Integer.valueOf(str);
		} catch (NumberFormatException e) {
			return 0;
		}
		return result;
	}
}
