package solutions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import basicStructures.TreeNode;

public class UniqueBinarySearchTreesII {
	public List<TreeNode> generateTrees(int n){
		if (n<=0){
		    List<TreeNode> list = new LinkedList<TreeNode>();
		    list.add(null);
		    return list;
		} 
		return generateTreeRecursion(1,n);
		
	}
	private List<TreeNode> generateTreeRecursion(int start,int end){
		if (start>end){
		    List<TreeNode> list = new LinkedList<TreeNode>();
		    list.add(null);
		    return list;
		}
		if (start==end) return new LinkedList<TreeNode>(Arrays.asList(new TreeNode[]{new TreeNode(start)}));
		
		List<TreeNode> list = new LinkedList<TreeNode>();
		
		for (int i=start;i<=end;i++){
		
			List<TreeNode> left=generateTreeRecursion(start,i-1);
			List<TreeNode> right=generateTreeRecursion(i+1,end);
			
			for (TreeNode lt:left){
				for (TreeNode rt:right){
					TreeNode t=new TreeNode(i);
					t.left=lt;
					t.right=rt;
					list.add(t);
				}
			}
		}
		return list;
	}

}
