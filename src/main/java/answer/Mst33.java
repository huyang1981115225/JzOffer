package answer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。 例如6、8都是丑数，但14不是，因为它包含因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * 
 * @author HY
 * 
 */
public class Mst33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数...");
		int index = scanner.nextInt();
		Mst33 mst33 = new Mst33();
		int result = mst33.GetUglyNumber_Solution(index);
		System.out.println("第" + index + "个丑数是" + result);
	}

	public int GetUglyNumber_Solution(int index) {
		if (index <= 0) {
			return 0;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		int i2 = 0, i3 = 0, i5 = 0;
		while (list.size() < index) {
			int m2 = list.get(i2) * 2;
			int m3 = list.get(i3) * 3;
			int m5 = list.get(i5) * 5;
			int min = Math.min(m2, Math.min(m3, m5));
			list.add(min);
			System.out.println(Arrays.toString(list.toArray()));
			if (min == m2)
				i2++;
			if (min == m3)
				i3++;
			if (min == m5)
				i5++;
		}
		return list.get(list.size() - 1);
	}
}
