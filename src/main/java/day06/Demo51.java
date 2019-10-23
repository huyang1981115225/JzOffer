package day06;
/**
 * 51.构建乘积数组
 * 
 * 给定一个数组A[0,1,...,n-1],
 * 请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法
 * 相当于再*A[i] 但是A[i] = 1 !!!!   所以就得到了以下的矩阵
 * B0      1   A1  A2  ...   An-2  An-1
 * B1     A0   1   A2  ...   An-2  An-1
 * B2     A0   A1  1   ...   An-2  An-1
 * ...
 * Bn-2   A0   A1  A2  ...   1     An-1
 * Bn-1   A0   A1  A2  ...   An-2  1
 * @author HY
 * 
 */
public class Demo51 {
	
	   public int[] multiply(int[] A) {
		   	return new int []{1};
	    }
}
