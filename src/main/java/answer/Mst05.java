package answer;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，
 * 完成队列的Push和Pop操作。
 * 队列中的元素为int类型。
 * @author HY
 *
 */
public class Mst05 {
	public static void main(String[] args) {
		Mst05 mst05 = new Mst05();
		mst05.push(12);
		mst05.push(45);
		mst05.push(30);
		System.out.println(mst05.pop()); // 队列先进先出
		System.out.println(mst05.pop());
		System.out.println(mst05.pop());
		mst05.push(68);
		mst05.push(88);
		System.out.println(mst05.pop());

	}

	Stack<Integer> stack1 = new Stack<Integer>();   //栈1
	Stack<Integer> stack2 = new Stack<Integer>();   //栈2

	public void push(int node) {
		stack1.push(node);
	}

	public int pop() {
		while (!stack1.isEmpty()) {
			/**
			 * 此时 stack1: [12,45,30] stack2: [30,45,12]
			 */
			stack2.push(stack1.pop());// 把stack1中的逐一pop出后push到stack2中
		}
		
		/**
		 * stack2 pop()就会拿到12，就是先放入stack1中的数
		 */
		int first = stack2.pop();

		/**
		 * 然后将stack pop()完之后剩下的数在逐一push()到stack1中
		 */
		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}

		return first;
	}
}