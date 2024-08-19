package leetcode;


// Definition for a binary tree node.

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	
	// inorder
	public void inorderTraversal(TreeNode root) {
		if (root != null) {
			inorderTraversal(root.left);
			System.out.print(root.val + " ");
			inorderTraversal(root.right);
		}
	}
	
	// preorder
	public void preorderTraversal(TreeNode root) {
		if (root != null) {
			System.out.print(root.val + " ");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}

	//post-order
	public void postorderTraversal(TreeNode root) {
		if (root != null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.print(root.val + " ");
		}
	}

	
}
