package answer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 求出1~13的整数中1出现的次数,
 * 并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有
 * 1、10、11、12、13因此共出现6次,
 * 但是对于后面问题他就没辙了。ACMer希望你们帮帮他,
 * 并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数。
 * 
 * @author HY
 *
 */
public class Mst31 {
	public static void main(String[] args) {
		Mst31 mst31 = new Mst31();
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数...");
		int n = scanner.nextInt();
		int result = mst31.NumberOf1Between1AndN_Solution(n);
		System.out.println(result);
	}
	
	public int NumberOf1Between1AndN_Solution(int n) {
		int count = 0;
		if (n<0) {
			return 0;
		}
		
		for (int i = 1; i <= n; i++) {
			String str = String.valueOf(i);
			char [] ch = str.toCharArray();
			System.out.println(Arrays.toString(ch));
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] == '1') {
					count++;
				}
			}
		}
		return count;
	}
}
