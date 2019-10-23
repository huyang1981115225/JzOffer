package answer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 *  每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Mst01 {
	public static void main(String[] args) {
		int [][] array = new int[3][];
		array[0] = new int[4];
		array[0][0] = 1;
		array[0][1] = 2;
		array[0][2] = 4;
		array[0][3] = 5;
		
		array[1] = new int[4];
		array[1][0] = 3;
		array[1][1] = 5;
		array[1][2] = 6;
		array[1][3] = 8;
		
		array[2] = new int[4];
		array[2][0] = 5;
		array[2][1] = 9;
		array[2][2] = 10;
		array[2][3] = 11;
		
		/**
		 *  输出二维数组
		 */
		System.out.println(Arrays.deepToString(array));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要查找的目标数：");
		int target = scanner.nextInt();
		Mst01 mst01 = new Mst01();
		mst01.Find(target, array);
	}
	public boolean Find(int target, int [][] array) {
		
		int rows = array.length;// 矩阵的行数
		int columns = array[0].length; //矩阵的列数
		
		/** 
		 * 从左下角元素往上查找，
		 * 右边元素是比这个元素大，
		 * 上边是的元素比这个元素小。
		 * 于是，target比这个元素小就往上找，
		 * 比这个元素大就往右找。如果出了边界，
		 * 则说明二维数组中不存在target元素。
		 * i = rows - 1;
		 * j = 0;
		 * 得到左下角坐标
		 */
		int i = rows- 1;//左下角 行
		int j = 0;  //左下角 列
		
		while (i >= 0 && j<columns ) {
			if (target < array[i][j]) {
				i--;// 往上找
			}else if (target > array[i][j]) {
				j++;// 往右找
			}else {
				System.out.println(target+"在第"+(i+1)+"行，第"+(j+1)+"列。");
				return true;
			}
		}
		System.out.println(target+"不在二维数组中。");
		return false;
	}
}
