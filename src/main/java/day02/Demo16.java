package day02;


/**
 * 16.合并两个排序的链表
 * 
 * 输入两个单调递增的链表， 
 * 输出两个链表合成后的链表， 
 * 当然我们需要合成后的链表满足单调不减规则。
 * 
 * @author HY
 *
 */
public class Demo16 {

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(5);
		ListNode node4 = new ListNode(7);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		node1.show(node1);

		ListNode node5 = new ListNode(2);
		ListNode node6 = new ListNode(4);
		ListNode node7 = new ListNode(6);
		ListNode node8 = new ListNode(8);
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		
		node5.show(node5);
		
		ListNode newList = Merge(node1, node5);
		newList.show(newList);
	}
	
	/**
	 * 递归方法实现
	 * 
	 * 1->3->5->7       3->5->7            3->5->7           5->7
	 *               1-                1-2             1-2-3            ...
	 * 2->4->6->8       2->4->6->8         4->6->8           4->6->8
	 * 
	 * @param list1
	 * @param list2
	 * @return
	 */
	public static ListNode Merge(ListNode list1, ListNode list2) {
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;
		ListNode res = null;
		if (list1.val < list2.val) {
			res = list1;
			res.next = Merge(list1.next, list2);
		} else {
			res = list2;
			res.next = Merge(list1, list2.next);
		}
		return res;
	}

}
