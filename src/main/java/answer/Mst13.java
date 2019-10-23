package answer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，
 * 偶数和偶数之间的相对位置不变。
 * @author HY
 *
 */
public class Mst13 {
	public static void main(String[] args) {
		int[] array = { 2, 1, 4, 6, 3, 7, 10, 9 };
		Mst13 mst13 = new Mst13();
		mst13.reOrderArray(array);
		mst13.reOrderArray2(array);
		System.out.println(Arrays.toString(array));
	}

	public void reOrderArray(int[] array) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				list1.add(array[i]);
			} else {
				list2.add(array[i]);
			}
		}
		list1.addAll(list2);
		System.out.println(Arrays.toString(list1.toArray()));
	}

	public void reOrderArray2(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				/**
				 * 因为是奇数在前，偶数在后，所以发现偶数在前时则交换
				 */
				if (array[j] % 2 == 0 && array[j + 1] % 2 == 1) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}
