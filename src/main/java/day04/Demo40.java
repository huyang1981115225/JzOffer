package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 40.数组中只出现一次的数字
 * 
 * 一个整型数组里除了两个数字之外，
 * 其他的数字都出现了两次。
 * 请写程序找出这两个只出现一次的数字。
 * 
 * @author HY
 *
 */
public class Demo40 {
	public static void main(String[] args) {
		int [] array = new int []{1,3,2,3,2,4,7,4};
		int num1[] = new int[1];
		int num2[] = new int[1];
		FindNumsAppearOnce(array, num1, num2);
	}
	
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
        	int num = 0;
        	for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					num++;
				}
			}
        	if (num == 1) {
				list.add(array[i]);
			}
		}
        
        num1[0] = list.get(0);
        num2[0] = list.get(1);
        System.out.println(num1[0]+","+num2[0]);
    }
}
