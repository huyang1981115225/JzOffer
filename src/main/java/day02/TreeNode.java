package day02;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int val) {
		super();
		this.val = val;
	}

	/**
	 * 思路是用arraylist模拟一个队列来存储相应的TreeNode,每次遍历将树的左节点，和右节点放入队列中
	 */
	public void printTreeFromTopBottom(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		List<TreeNode> queue = new ArrayList<TreeNode>();
		if (root == null) {
			return;
		}
		queue.add(root);
		while (queue.size() != 0) {
			TreeNode temp = queue.remove(0);
			if (temp.left != null) {
				queue.add(temp.left);
			}
			if (temp.right != null) {
				queue.add(temp.right);
			}
			list.add(temp.val);
		}
		System.out.println(list);
	}
}
