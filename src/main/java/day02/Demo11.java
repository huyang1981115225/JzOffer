package day02;

import java.util.Scanner;


/**
 * 11.二进制中1的个数
 * 
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 * 
 * @author HY
 *
 */
public class Demo11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数...");
		int n = scanner.nextInt();
		int result = NumberOf1(n);
		System.out.println("该整数的二进制表示为： " + Integer.toBinaryString(n)
				+ ",其中1的个数为：" + result);
	}

    public static int NumberOf1(int n) {
    	// 转换为二进制
    	String str = Integer.toBinaryString(n);
    	int num = 0;
    	for (int i = 0; i < str.length(); i++) {
        	if (str.charAt(i) == '1') {
    			num++;
    		}
		}

    	return num;
    }
}
