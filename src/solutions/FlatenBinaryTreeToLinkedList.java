package solutions;

import basicStructures.TreeNode;

public class FlatenBinaryTreeToLinkedList {
	 public void flatten(TreeNode root) {
		if (root==null) return;
		
		while(root.left!=null||root.right!=null){
			if (root.left==null)
				root=root.right;
			else{
				TreeNode temp=root.left;
				while (temp.right!=null) temp=temp.right;
				
				temp.right=root.right;
				root.right=root.left;
				root.left=null;
			}
		}
		return;
	 }
}
