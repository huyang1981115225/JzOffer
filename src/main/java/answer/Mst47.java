package answer;

import java.util.Scanner;

/**
 * 求1+2+3+...+n，要求不能使用乘除法、
 * for、while、if、else、switch、case
 * 等关键字及条件判断语句（A?B:C）。
 * 
 * @author HY
 *
 */
public class Mst47 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("请输入一个整数");
		int n = scanner.nextInt();
		Mst47 mst47 = new Mst47();
		int sum = mst47.Sum_Solution(n);
		System.out.println("1+2+...+"+n+"="+sum);
	}
	
	/**
	 * 解题思路：
	 * 1.需利用逻辑与的短路特性实现递归终止。
	 * 2.当n==0时，(n>0)&&((sum+=Sum_Solution(n-1))>0)只执行前面的判断,为false，然后直接返回0； 
	 * 3.当n>0时，执行sum+=Sum_Solution(n-1)，实现递归计算Sum_Solution(n)。
	 * @param n
	 * @return
	 */
	public int Sum_Solution(int n) {
		int sum = n;
		boolean flag = (sum>0)&&((sum+=Sum_Solution(--n))>0);
		return sum;
	}
}
