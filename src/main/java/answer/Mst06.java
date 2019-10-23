package answer;

import java.util.Arrays;
/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，
 * 我们称之为数组的旋转。 输入一个非递减排序的数组的一个旋转，
 * 输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，
 * 该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0
 * @author HY
 *
 */
public class Mst06 {
	public static void main(String[] args) {
		int [ ] array = {5,6,8,1,2,1,3,4};
		Mst06 mst06 = new Mst06();
		int min = mst06.minNumberInRotateArray2(array);
		System.out.println(min);
		
	}
	public int minNumberInRotateArray(int[] array) {
		int low = 0;
		int high = array.length - 1;
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (array[mid] > array[high]) {
				low = mid + 1;
			} else if (array[mid] == array[high]) {
				high = high - 1;
			} else {
				high = mid;
			}
		}
		return array[low];
	}
	
	public int minNumberInRotateArray2(int[] array) {
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		return array[0];
	}
}
