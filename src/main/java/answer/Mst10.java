package answer;

import java.util.Scanner;

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，
 * 总共有多少种方法？
 * @author HY
 *
 */
public class Mst10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数...");
		int n = scanner.nextInt();
		Mst10 mst10 = new Mst10();
		int result = mst10.RectCover(n);
		System.out.println("总共有" + result + "种方法。");
	}

	public int RectCover(int target) {
		if (target < 0) {
			return 0;
		} else if (target == 1 || target == 2) {
			return target;
		} else {
			return RectCover(target - 1) + RectCover(target - 2);
		}
	}
}
