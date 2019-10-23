package day05;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 41.和为S的连续正数序列
 * 
 * 小明很喜欢数学,有一天他在做数学作业时,
 * 要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,
 * 你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 * 
 * @author HY
 *
 */
public class Demo41 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数: ");
		int sum = scanner.nextInt();

		ArrayList<ArrayList<Integer>> result = FindContinuousSequence(sum);
		System.out.println(result);
	}

	public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		// 存放结果
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		// 两个起点，相当于动态窗口的两边，根据其窗口内的值来确定窗口的位置和大小
		int plow = 1;
		int phigh = 2;
		while (phigh > plow) {
			// 由于是连续的，差值是1的序列，那么求和公式是(1+n)*n/2
			int cur = (plow + phigh) * (phigh - plow + 1) / 2;
			// 相等，那么就将窗口范围的所有数添加进结果集
			if (cur == sum) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				for (int i = plow; i <= phigh; i++) {
					list.add(i);
				}
				result.add(list);
				plow++;
				// 如果当前窗口的值之和小于sum，那么右边窗口右移一下
			} else if (cur < sum) {
				phigh++;

				// 如果当前窗口的值之和大于sum，那么左边窗口右移一下
			} else {
				plow++;
			}
		}
		return result;
	}
}
