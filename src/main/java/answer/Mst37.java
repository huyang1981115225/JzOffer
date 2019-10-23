package answer;
/**
 * 统计一个数字在排序数组中出现的次数
 * 
 * @author HY
 *
 */
public class Mst37 {
	public static void main(String[] args) {
		Mst37 mst37 = new Mst37();
		int [] array = {1,5,4,2,5,6,5,8,9};
		int k = 5;
		int reuslt = mst37.GetNumberOfK(array, k);
		System.out.println(k+"出现了"+reuslt+"次。");
		
	}
	
	public int GetNumberOfK(int [] array , int k) {
		int count = 0;
		if (array == null || array.length == 0)
            return count;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == k) {
				count++;
			}
		}
		return count;
	}
}
