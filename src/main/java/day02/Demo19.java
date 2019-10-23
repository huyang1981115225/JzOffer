package day02;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 19.顺时针打印矩阵
 * 
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下矩阵： 
 *                      1  2   3   4 
 *                      5  6   7   8 
 *                      9  10  11  12 
 *                      13 14  15  16 
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * 
 * @author HY
 *
 */
public class Demo19 {
	public static void main(String[] args) {
		int[][] array = new int[4][4];
		array[0][0] = 1;
		array[0][1] = 2;
		array[0][2] = 3;
		array[0][3] = 4;

		array[1][0] = 5;
		array[1][1] = 6;
		array[1][2] = 7;
		array[1][3] = 8;

		array[2][0] = 9;
		array[2][1] = 10;
		array[2][2] = 11;
		array[2][3] = 12;

		array[3][0] = 13;
		array[3][1] = 14;
		array[3][2] = 15;
		array[3][3] = 16;
		System.out.println(Arrays.deepToString(array));

		printMatrix(array);
	}

	public static ArrayList<Integer> printMatrix(int[][] array) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int row = array.length;// 行
		int col = array[0].length;// 列
		if (row == 0) {
			return result;
		}

		int layers = (Math.min(row, col) / 2 + 1);// 层数
		System.out.println("该矩阵有" + layers + "层");
		for (int i = 0; i < layers; i++) {
			// 从左至右
			for (int k = i; k < col - i; k++)
				result.add(array[i][k]);

			// 从右上至右下
			for (int j = i + 1; j < row - i; j++)
				result.add(array[j][col - i - 1]);

			// 从右下至左下
			for (int k = col - i - 1 -1; (k >= i) && (row - i - 1 != i); k--)
				result.add(array[row - i - 1][k]);

			// 从左下至左上
			for (int j = row - i - 1 - 1; (j > i) && (col - i - 1 != i); j--)
				result.add(array[j][i]);
		}
		System.out.println(result);
		return result;
	}
}
