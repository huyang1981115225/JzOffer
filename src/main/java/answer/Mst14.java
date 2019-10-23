package answer;

/**
 * 输入一个链表，输出该链表中倒数第k个结点
 * @author HY
 *
 */
public class Mst14 {
	/**
	 * 首先定义两个指向链表头的指针p ,q;
	 * 先令一个指针指向第k节点，然后两个指针同时向后移动，
	 * 最后p指向的即为倒数第k个节点。当k为零或节点为空返回。
	 * 
	 * @param head
	 * @param k
	 * @return
	 */
	
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
		
		
		int k = 4;
		ListNode result = FindKthToTail(node1, k);
		System.out.println(result.val);
	}
	public static ListNode FindKthToTail(ListNode head, int k) {    // {1,2,3,4,5} 4
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
