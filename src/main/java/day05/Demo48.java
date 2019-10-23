package day05;
/**
 * 48.不用加减乘除做加减法
 * 
 * 写一个函数，求两个整数之和，
 * 要求在函数体内不得使用+、-、*、/四则运算符号。
 * 
 * @author HY
 *
 */
public class Demo48 {
	
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 7;
		System.out.println(Add(num1, num2));
	}
	
	/**
	 * 首先看十进制是怎么做的：5+7=12，三步走
	 * 第一步：相加各位的值，不算进位，得到2
	 * 第二步：计算进位值，得到10，如果这一步得到的进位值是0，那么第一步得到的结果就是最终结果。
	 * 第三步：重复上述两步，只是相加的值变成上述两步得到的结果2和10，得到12
	 * 
	 * 同样，我们可以利用三步走的方式计算二进制值相加： 5--101,7--111
	 * 第一步：相加各位的值，不算进位，得到010，二进制每位相加就相当于各位做异或操作，101^111.
	 * 第二步：计算进位值，得到1010，相当于做与操作得到101，再向左移一位得到1010 (101&111)<<1
	 * 第三步：重复上述两步，
	 * 各位相加 010^1010=1000,进位值(010&1010)<<1 = 100
	 * 各位相加 1000^100=1100,进位值(1000&100)<<1 = 0,跳出循环，1100为最终结果 
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	
	// 迭代写法
	public static int Add(int num1, int num2) {
		while (num2 != 0) {
			int temp = num1 ^ num2; // 异或 相加各位的值
			num2 = (num1 & num2) << 1; // 与运算后左移一位 相加进位值
			num1 = temp;
		}
		return num1;
	}

	// 递归写法
	int add(int num1, int num2) {
		if (num2 == 0)
			return num1;
		int sum = num1 ^ num2; // 异或 相加各位的值
		int carry = (num1 & num2) << 1; // 与运算后左移一位 相加进位值
		return add(sum, carry);
	}
	
	// 减法
	int substract(int num1, int num2){
	    int subtractor = add(~num2, 1);// 先求减数的补码（取反加一）
	    int result = add(num1, subtractor); // add()即上述加法运算　　
	    return result ;
	}
}
