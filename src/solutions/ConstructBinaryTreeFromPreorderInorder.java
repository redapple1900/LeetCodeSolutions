package solutions;

import basicStructures.TreeNode;

public class ConstructBinaryTreeFromPreorderInorder {

	    public TreeNode buildTree(int[] preorder, int[] inorder) {
	        if (inorder==null||preorder==null) return null;
	        if (inorder.length!=preorder.length) return null;
	        TreeNode root= buildTreeHelper(inorder,preorder,0,inorder.length,0,preorder.length);
	        return root;
	    }
	    private TreeNode buildTreeHelper(int[] inorder,int[] preorder,int is,int ie,int ps,int pe){
	        if (is==ie) return null;
	        TreeNode root = new TreeNode(preorder[ps]);
	        int root_position=search(inorder,is,ie,root.val);
	        if (root_position==-1) return null;
	        root.left=buildTreeHelper(inorder,preorder,is,root_position,ps+1,ps+root_position-is+1);
	        root.right=buildTreeHelper(inorder,preorder,root_position+1,ie,ps+root_position-is+1,pe);
	        return root;
	    }
	    private int search(int[] inorder,int is,int ie,int target){
	        for (int i=is;i<ie;i++)
	            if (inorder[i]==target)
	                return i;
	        return -1;
	    }
	}
