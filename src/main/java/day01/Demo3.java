package day01;

import java.util.ArrayList;

/**
 * 3.从尾到头打印链表
 * 
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * 
 * @author HY
 * 
 */
public class Demo3 {
	
	public static void main(String[] args) {
		
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;
		ArrayList<Integer> list = printListFromTailToHead(node1);
		System.out.println(list);
		
	}
	
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(listNode!=null){
			list.add(0,listNode.val);// 很巧妙，可实现头插法
			listNode = listNode.next;
		}
		return list;
	}
}
