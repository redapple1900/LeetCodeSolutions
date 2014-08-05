package solutions;

import basicStructures.TreeNode;

public class ConstructBinaryTreeFromInorderPostOrder {

	    public TreeNode buildTree(int[] inorder, int[] postorder) {
	        if (inorder==null||postorder==null) return null;
	        if (inorder.length!=postorder.length) return null;
	        TreeNode root= buildTreeHelper(inorder,postorder,0,inorder.length,0,postorder.length);
	        return root;
	    }
	    private TreeNode buildTreeHelper(int[] inorder,int[] postorder,int is,int ie,int ps,int pe){
	        if (is==ie) return null;
	        TreeNode root = new TreeNode(postorder[pe-1]);
	        int root_position=search(inorder,is,ie,root.val);
	        if (root_position==-1) return null;
	        root.left=buildTreeHelper(inorder,postorder,is,root_position,ps,ps+root_position-is);
	        root.right=buildTreeHelper(inorder,postorder,root_position+1,ie,ps+root_position-is,pe-1);
	        return root;
	    }
	    private int search(int[] inorder,int is,int ie,int target){
	        for (int i=is;i<ie;i++)
	            if (inorder[i]==target)
	                return i;
	        return -1;
	    }
	}
