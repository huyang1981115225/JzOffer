package day04;
/**
 * 31.整数中1出现的次数（从1到n整数中1出现的次数）
 * 
 * 求出1~13的整数中1出现的次数,
 * 并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有
 * 1、10、11、12、13因此共出现6次,
 * 但是对于后面问题他就没辙了。ACMer希望你们帮帮他,
 * 并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数。
 * 
 * @author HY
 *
 */
public class Demo31 {
	
	public static void main(String[] args) {
		System.out.println(NumberOf1Between1AndN_Solution(11));
	}
	
	public static int NumberOf1Between1AndN_Solution(int n) {
		int num = 0;
		if (n <=0) {
			return 0;
		}
		
		for (int i = 1; i <= n; i++) {
			String temp = String.valueOf(i);
			char [] c = temp.toCharArray();
			for (int j = 0; j < c.length; j++) {
				if (c[j] == '1') {
					num++;
				}
			}
		}
		return num;
	}

}
