package day02;
/**
 * 定义链表
 * 
 * @author HY
 *
 */
public class ListNode {
	
	int val;
	
	ListNode next = null;

	public ListNode(int val) {
		super();
		this.val = val;
	}
	
	/**
	 * 打印链表
	 * @param head
	 */
	public void show(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}
}
