package answer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 输入一个递增排序的数组和一个数字S，
 * 在数组中查找两个数，使得他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的
 * 
 * @author HY
 *
 */
public class Mst42 {
	public static void main(String[] args) {
		int [] array = {1,2,4,6,7,8,9,10};
		int sum = 10;
		Mst42 mst42 = new Mst42();
		ArrayList<Integer> list = mst42.FindNumbersWithSum(array, sum);
		System.out.println(Arrays.toString(list.toArray()));
	}
	
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (array == null || array.length < 2) {
			return list;
		}
		int i=0,j=array.length-1;
		 while(i<j){
			 if(array[i]+array[j]==sum){
				 list.add(array[i]);
				 list.add(array[j]);
				 return list;
			 }else if(array[i]+array[j]>sum){
				 j--;
			 }else{
				 i++;
			 }
		 }
		 return list;
	}
}
