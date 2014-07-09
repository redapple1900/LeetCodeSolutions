package solutions;

import java.util.Deque;
import java.util.LinkedList;

import basicStructures.TreeNode;

public class PathSum {
	public boolean hasPathSum(TreeNode root,int sum){
		if (root==null) return false;
		Deque<Integer> sum_queue = new LinkedList<Integer>();
		Deque<TreeNode> node_queue=new LinkedList<TreeNode>();
		sum_queue.addFirst(root.val);
		node_queue.addFirst(root);
		while(!node_queue.isEmpty()){
			TreeNode node=node_queue.pollFirst();
			int num=sum_queue.pollFirst();
			if (node.left==null&&node.right==null){
				if (num==sum) return true;
			}
			if (node.left!=null){
				node_queue.addLast(node.left);
				sum_queue.addLast(node.left.val+num);
			}
			if (node.right!=null){
				node_queue.addLast(node.right);
				sum_queue.addLast(node.right.val+num);
			}
		}
		return false;
	}
}
