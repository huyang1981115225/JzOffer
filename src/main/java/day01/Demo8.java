package day01;

import java.util.Scanner;

/**
 * 8.跳台阶
 * 
 * 一只青蛙一次可以跳上1级台阶，
 * 也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author HY
 *
 */
public class Demo8 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入台阶数...");
		int target = scanner.nextInt();
		int result = JumpFloor(target);
		System.out.println("青蛙跳" + target + "级台阶总共有" + result + "种方法。");
	}
	
    public static int JumpFloor(int target) {
    	if (target==1||target==2) {
			return target;
		}
    	return JumpFloor(target-2)+JumpFloor(target-1);
    }

}
