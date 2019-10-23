package day01;

import java.util.Scanner;

/**
 * 7.斐波那契数
 * 
 * 大家都知道斐波那契数列，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项。n<=39
 * 
 * 1 1 2 3 5 8 13 21 34...
 * 
 * @author HY
 *
 */
public class Demo7 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("你想输出斐波那契数列的第几项：");
		int n = scanner.nextInt();
		int result = Fibonacci(n);
		System.out.println("斐波那契数列第"+n+"项是"+result);

	}
	
	public static int Fibonacci(int n) {
		if(n<0){
			return 0;
		}else if(n == 1 || n ==2){
			return 1;
		}else{
			return Fibonacci(n-2)+Fibonacci(n-1);
		}
	}
}
