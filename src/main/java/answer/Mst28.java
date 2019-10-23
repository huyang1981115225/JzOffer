package answer;

import java.util.Arrays;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半， 请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * 
 * @author HY
 * 
 */
public class Mst28 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 3, 1, 1, 5, 3, 3, 3, 3, 3 };
		Mst28 mst28 = new Mst28();
		int result = mst28.MoreThanHalfNum_Solution(array);
		System.out.println(result);
		result = mst28.MoreThanHalfNum_Solution2(array);
		System.out.println(result);
	}

	public int MoreThanHalfNum_Solution(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}
			}
			if (count > array.length / 2) {
				return array[i];
			}
		}
		return 0;
	}

	public int MoreThanHalfNum_Solution2(int[] array) {
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == array[array.length / 2]) {
				count++;
			}
		}
		if (count > array.length / 2) {
			return array[array.length / 2];
		} else {
			return 0;
		}
	}
}
