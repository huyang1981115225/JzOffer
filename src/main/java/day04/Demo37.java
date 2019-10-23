package day04;
/**
 * 37.数字在排序数组中出现的次数
 * 
 * 统计一个数字在排序数组中出现的次数
 * 
 * @author HY
 *
 */
public class Demo37 {
	
	public int GetNumberOfK(int [] array , int k) {
		int num = 0;
		if (array == null || array.length == 0)
            return num;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == k) {
				num++;
			}
		}
		return num;
	}

}
