package answer;

import java.util.Scanner;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 * @author HY
 *
 */
public class Mst11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数...");
		int n = scanner.nextInt();
		Mst11 mst11 = new Mst11();
		int result = mst11.NumberOf1(n);
		System.out.println("该整数的二进制表示为： " + Integer.toBinaryString(n)
				+ ",其中1的个数为：" + result);
	}

	public int NumberOf1(int n) {
		int num = 0;
		char[] ch = Integer.toBinaryString(n).toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '1') {
				num++;
			}
		}
		return num;
	}
}
