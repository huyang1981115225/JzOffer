package answer;

import java.util.Scanner;

/**
 * 一只青蛙一次可以跳上1级台阶，
 * 也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author HY
 *
 */
public class Mst08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入台阶数...");
		int target = scanner.nextInt();
		Mst08 mst08 = new Mst08();
		int result = mst08.JumpFloor(target);
		System.out.println("青蛙跳" + target + "级台阶总共有" + result + "种方法。");

	}

	public int JumpFloor(int target) {
		if (target == 1) {
			return 1;
		} else if (target == 2) {
			return 2;
		} else {
			return JumpFloor(target - 1) + JumpFloor(target - 2);
		}
	}
}
