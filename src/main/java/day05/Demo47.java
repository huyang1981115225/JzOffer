package day05;

import java.util.Scanner;

/**
 * 47.求1+2+3+..+n
 * 
 * 求1+2+3+...+n，要求不能使用乘除法、
 * for、while、if、else、switch、case
 * 等关键字及条件判断语句（A?B:C）。
 * 
 * @author HY
 *
 */
public class Demo47 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int n = scanner.nextInt();
		int result = Sum_Solution(n);
		System.out.println("1 + 2 +...+ n = "+result);
	}
	
    public static int Sum_Solution(int n) {
    	int sum = n;
		boolean flag = (sum>0)&&((sum+=Sum_Solution(--n))>0);
		return sum;
    }
}
