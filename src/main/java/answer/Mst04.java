package answer;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，
 * 请重建出该二叉树。假设输入的前序遍历和 中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8} 和中序遍历序列{4,7,2,1,5,3,8,6}， 则重建二叉树并返回。
 * 
 * @author HY
 * 
 */
public class Mst04 {
	public static void main(String[] args) {
		Mst04 mst04 = new Mst04();
		int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };  //前序遍历
		int[] mid = { 4, 7, 2, 1, 5, 3, 8, 6 };  //中序遍历
		mst04.reConstructBinaryTree(pre, mid);
	}

	/**
	 * 重建二叉树
	 * @param pre
	 * @param in
	 * @return
	 */
	public TreeNode reConstructBinaryTree(int[] pre, int[] mid) {
		TreeNode root = reConstructBinaryTree(pre, 0, pre.length - 1, mid, 0,mid.length - 1);
		return root;
	}

	// 前序遍历 {1,2,4,7,3,5,6,8}
	// 中序遍历 {4,7,2,1,5,3,8,6}
	// 由以上可以求出后序遍历{7,4,2,5,8,6,3,1}              0            7                        0           7
	/**
	 *  第一次调用:
     *  reConstructBinaryTree(pre, 0, pre. length-1, in, 0, in. length-1);
     *  左子树长度 = i-startIn
     *  右子树长度 = endIn-i
     *  根:root = pre[startpre]
     * 左子树:root.left = reConstructBinaryTree(pre, startpre+l, startPre+i-startIn, in,startIn,i-l)
     * 右子树:root.right = reConstructBinaryTree(pre, startPre+i-startin+l, endPre, in,i+l,endIn)
	 * @param pre  前序遍历
	 * @param startPre
	 * @param endPre
	 * @param mid   中序遍历
	 * @param startIn
	 * @param endIn
	 * @return
	 */
	private TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre,int[] mid, int startIn, int endIn) {
		if (startPre > endPre || startIn > endIn) {
			return null;
		}
		TreeNode root = new TreeNode(pre[startPre]);// 先序排列的第一个数即为根元素！！！

		for (int i = startIn; i <= endIn; i++) {
			if (mid[i] == pre[startPre]) {
				root.left = reConstructBinaryTree(pre, startPre + 1, startPre + i - startIn, mid, startIn, i - 1);
				root.right = reConstructBinaryTree(pre, i - startIn + startPre + 1, endPre, mid, i + 1, endIn);
				break;
			}
		}
		System.out.print(root.val + " ");
		return root;
	}
}

/**
 * Definition for binary tree
 * 定义二叉树TreeNode
 */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
 
