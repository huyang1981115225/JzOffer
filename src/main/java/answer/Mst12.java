package answer;

import java.util.Scanner;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。
 * 求base的exponent次方
 * @author HY
 *
 */
public class Mst12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个浮点数:");
		double base = scanner.nextDouble();
		System.out.println("请输入一个整数:");
		int exponent = scanner.nextInt();
		Mst12 mst12 = new Mst12();
		double result = mst12.Power(base, exponent);
		System.out.println(base+"^"+exponent+"="+result);
	}
	
	public double Power(double base, int exponent) {
		double restlt = 1;
		/**
		 * 取绝对值
		 * Math.abs();
		 */
		for (int i = 0; i < Math.abs(exponent); i++) {
			restlt *= base;
		}
		/**
		 * 别忘了小于0的情况
		 */
		if (exponent < 0) {
			restlt = 1/restlt;
		}
		return restlt;
	}
}
