package answer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 在一个字符串(1<=字符串长度<=10000，全部由字母组成)
 * 中找到第一个只出现一次的字符,并返回它的位置.
 * 
 * @author HY
 *
 */
public class Mst34 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符串...");
		String str = scanner.nextLine();
		Mst34 mst34 = new Mst34();
		int result = mst34.FirstNotRepeatingChar(str);
		System.out.println("第一个只出现一次的字符下标位置在"+result);
		
		result = mst34.FirstNotRepeatingChar2(str);
		System.out.println("第一个只出现一次的字符下标位置在"+result);
	}
	
	public int FirstNotRepeatingChar(String str) {
		if (str == null || str.length() == 0) {
			return -1;
		}
		char [] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
			}
			if (count == 1) {
				return i;
			}
		}
		return -1;
	}
	
	public int FirstNotRepeatingChar2(String str) {
		if (str == null || str.length() == 0) {
			return -1;
		}
		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i <str.length(); i++) {
			System.out.println(Arrays.toString(list.toArray()));
			char ch = str.charAt(i);
			if (!list.contains(ch)) {
				list.add(Character.valueOf(ch));
			}else {
				list.remove(Character.valueOf(ch));
			}
		}
		if(list.size() <=0) return -1;
		return str.indexOf(list.get(0));
	}
}
