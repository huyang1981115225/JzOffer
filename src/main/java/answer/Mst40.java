package answer;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个整型数组里除了两个数字之外，
 * 其他的数字都出现了两次。
 * 请写程序找出这两个只出现一次的数字。
 * 
 * @author HY
 *
 */
public class Mst40 {
	public static void main(String[] args) {
		int [] array = {2,4,3,6,3,2,5,5};
		Mst40 mst40 = new Mst40();
		int [] num1 = new int [1];
		int [] num2 = new int [1];
		mst40.FindNumsAppearOnce(array, num1, num2);
		
		mst40.FindNumsAppearOnce2(array, num1, num2);
	}
	//num1,num2分别为长度为1的数组。传出参数
	//将num1[0],num2[0]设置为返回结果
	public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}
			}
			if (count == 1 ) {
				list.add(array[i]);
			}
		}
		num1[0] = list.get(0);
		num2[0] = list.get(1);
		System.out.println(num1[0]);
		System.out.println(num2[0]);
		
	}
	
	public void FindNumsAppearOnce2(int [] array,int num1[] , int num2[]) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < array.length; i++) {
			if (!list.contains(String.valueOf(array[i]))) {
				list.add(String.valueOf(array[i]));
			}else {
				list.remove(String.valueOf(array[i]));
			}
		}
		
		if (list.size() < 1) {
			return;
		}
		
		num1[0] = Integer.valueOf(list.get(0));
		num2[0] = Integer.valueOf(list.get(1));
		System.out.println(num1[0]);
		System.out.println(num2[0]);
		
		
	}
}
