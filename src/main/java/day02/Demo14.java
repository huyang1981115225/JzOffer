package day02;

/**
 * 14.链表中倒数第k个结点
 * 
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 
 * @author HY
 *
 */
public class Demo14 {

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node1.show(node1);

		int k = 4;
		ListNode result = FindKthToTail(node1, k);
		System.out.println(result.val);
	}

	public static ListNode FindKthToTail(ListNode head, int k) { // {1,2,3,4,5}
																	// 4
		ListNode p;
		ListNode q;
		p = q = head;
		int i;
		for (i = 0; p != null; i++) {
			if (i >= k) {
				q = q.next;
			}
			p = p.next;
		}
		return i < k ? null : q;
	}
}
