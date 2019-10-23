package sort;

import java.util.Arrays;

/**
 * 插入排序
 * 
 * @author HY
 *
 */
public class InsertSort {
	
	public static void main(String[] args) {
		int [] arr = new int [] {4,2,5,1,6,3,9,8,7};
		insertSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void insertSort(int[] arr) {
		// 从第二个开始遍历
		for (int i = 1; i < arr.length; i++) {
			// 如果当前数字比前一个数字小
			if (arr[i] < arr[i - 1]) {
				// 把当前遍历数字存起来
				int temp = arr[i];

				int j;
				// 遍历当前数字前面的所有数字
				for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
					// 把前一个数字赋值给后一个数字
					arr[j + 1] = arr[j];
				}
				// 把临时变量赋给不满足条件的后一个元素
				arr[j + 1] = temp;
			}
		}
	}
}
