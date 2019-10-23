package answer;

import java.util.Scanner;

/**
 * 地上有一个m行和n列的方格。
 * 一个机器人从坐标0,0的格子开始移动，
 * 每一次只能向左，右，上，下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于k的格子。 
 * 例如，当k为18时，机器人能够进入方格（35,37），
 * 因为3+5+3+7 = 18。但是，它不能进入方格（35,38），
 * 因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 * 
 * 注意：是行列坐标的数位之和，不是行列坐标之和！！！
 * 
 * @author HY
 * 
 */
public class Mst66 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数...");
		int threshold = scanner.nextInt();
		System.out.println("请输入行数...");
		int rows = scanner.nextInt();
		System.out.println("请输入列数...");
		int cols = scanner.nextInt();
		Mst66 mst66 = new Mst66();
		int result = mst66.movingCount(threshold, rows, cols);
		System.out.println("机器人能够达到"+result+"个格子。");
		
		result = mst66.movingCount2(threshold, rows, cols);
		System.out.println("机器人能够达到"+result+"个格子。");
	}

	public int movingCount(int threshold, int rows, int cols) {
		int flag[][] = new int[rows][cols];// 记录是否已经走过
		return helper(0, 0, rows, cols, flag, threshold);

	}
	
	public int movingCount2(int threshold, int rows, int cols) {
		if (rows < 0  || cols < 0 ) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (numSum(i)+numSum(j) <= threshold) {
					count++;
				}
			}
		}
		return count;
	}
 
	private int helper(int i, int j, int rows, int cols, int[][] flag,
			int threshold) {
		if (i < 0 || i >= rows || j < 0 || j >= cols
				|| numSum(i) + numSum(j) > threshold || flag[i][j] == 1) {
			return 0;
		}
		flag[i][j] = 1;
		return helper(i - 1, j, rows, cols, flag, threshold)
			 + helper(i + 1, j, rows, cols, flag, threshold)
		     + helper(i, j - 1, rows, cols, flag, threshold)
			 + helper(i, j + 1, rows, cols, flag, threshold) + 1;
	}
	
	/**
	 * 计算数位的和
	 * 
	 * @param i
	 * @return
	 */
	private int numSum(int i) {
		int sum = 0;
		do {
			sum += i % 10;
		} while ((i = i / 10) > 0);
		return sum;
	}
}
