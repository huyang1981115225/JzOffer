package sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 
 * @author HY
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 1, 7, 3, 5, 9, 0 };

		bubbleSort(arr);

		System.out.println(Arrays.toString(arr));
	}

	public static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
