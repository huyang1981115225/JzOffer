package day02;

/**
 * 18.二叉树的镜像
 * 
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 输入描述:
 * 二叉树的镜像定义：源二叉树 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
    	
 * @author HY
 *
 */
public class Demo18 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(8);
		TreeNode rootLeft  = new TreeNode(6);
		TreeNode rootRight = new TreeNode(10);
		TreeNode rootLeftLeft = new TreeNode(5);
		TreeNode rootLeftRight = new TreeNode(7);
		TreeNode rootRightLeft = new TreeNode(9);
		TreeNode rootRightRight = new TreeNode(11);
		
		root.left = rootLeft;
		root.right = rootRight;
		rootLeft.left = rootLeftLeft;
		rootLeft.right = rootLeftRight;
		rootRight.left = rootRightLeft;
		rootRight.right = rootRightRight;
		
		root.printTreeFromTopBottom(root);
		
		Mirror(root);
		
		root.printTreeFromTopBottom(root);
	}
	
	public static void Mirror(TreeNode root) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			return;
		}
		TreeNode pTemp = root.left;
		root.left = root.right;
		root.right = pTemp;
		if (root.left != null) {
			Mirror(root.left);
		}
		if (root.right != null) {
			Mirror(root.right);
		}
	}
}
