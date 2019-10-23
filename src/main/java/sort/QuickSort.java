package sort;

import java.util.Arrays;

/**
 * 快速排序
 * 
 * @author HY
 *
 */
public class QuickSort {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 5, 8, 6, 2, 4, 1, 8, 5, 6, 9 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			// 把数组中开始的那个数作为标准数
			int stard = arr[start];

			// 记录需要排序的下标
			int low = start;
			int high = end;
			// 循环找比标准数大的和小的数
			while (low < high) {

				// 如果右边的数字比标准数大，则右下标左移
				while (low < high && arr[high] >= stard) {
					high--;
				}

				// 否则将右下标的数字赋值给左下标
				arr[low] = arr[high];

				// 如果左下标的数比标准数小，则左下标右移
				while (low < high && arr[low] <= stard) {
					low++;
				}

				// 否则将左下标的数字赋值给右下标
				arr[high] = arr[low];
			}

			// 将标准数赋值给低或高所在位置的数
			arr[low] = stard;

			// 递归，处理左边所有小的数字
			quickSort(arr, start, low);

			// 递归，处理右边所有大的数字
			quickSort(arr, low + 1, end);
		}
	}
}
