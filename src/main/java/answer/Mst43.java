package answer;
/**
 * 汇编语言中有一种移位指令叫做循环左移（ROL），
 * 现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，
 * 即“XYZdefabc”。是不是很简单？OK，搞定它！
 * 
 * @author HY
 *
 */
public class Mst43 {
	public static void main(String[] args) {
		String str = ",";
		int n = 6;
		Mst43 mst43 = new Mst43();
		String result = mst43.LeftRotateString(str, n);
		System.out.println(result);
	}
	
	public String LeftRotateString(String str,int n) {
		if (str.length() < n || str == null) {
			return "";
		}
		StringBuilder builder = new StringBuilder();
		builder.append(str.substring(n));
		builder.append(str.substring(0, n));
		return builder.toString();
	}
}
