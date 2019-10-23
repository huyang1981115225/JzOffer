package answer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，
 * 则最小的4个数字是1,2,3,4,。
 * 
 * @author HY
 *
 */
public class Mst29 {
	public static void main(String[] args) {
		int[] input = { 4, 5, 1, 6, 2, 7, 3, 8 };
		Mst29 mst29 = new Mst29();
		ArrayList<Integer> list = mst29.GetLeastNumbers_Solution(input, 10);
		System.out.println(Arrays.toString(list.toArray()));
	}

	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (input == null || k <= 0 || k > input.length)
			return list;
		Arrays.sort(input);
		for (int i = 0; i < k; i++) {
			list.add(input[i]);
		}
		return list;
	}
}
