package answer;

import java.util.ArrayList;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * 
 * @author HY
 * 
 */
public class Mst03 {
	  public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        while (listNode != null) {
				list.add(0, listNode.val);// 很巧妙，可实现头插法
				listNode = listNode.next;
			}
	        return list;
	    }
}

