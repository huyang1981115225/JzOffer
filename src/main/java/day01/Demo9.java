package day01;

import java.util.Scanner;

/**
 * 9.变态跳台阶
 * 
 * 一只青蛙一次可以跳上1级台阶， 也可以跳上2级……它也可以跳上n级。 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 
 * @author HY
 *
 */
public class Demo9 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入台阶数...");
		int target = scanner.nextInt();
		int result = JumpFloorII(target);
		System.out.println("青蛙跳" + target + "级台阶总共有" + result + "种方法。");
	}
	public static int JumpFloorII(int target) {
		if (target == 1) {
			return target;
		}
		return 2 * JumpFloorII(target - 1);
	}
}
