package solutions;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import basicStructures.TreeNode;

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

		Deque<Integer> sum_queue = new LinkedList<Integer>();
		Deque<TreeNode> node_queue = new LinkedList<TreeNode>();
		Deque<List<Integer>> list_queue = new LinkedList<List<Integer>>();
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		List<Integer> list = new LinkedList<Integer>();
        
        if (root == null)
			return result;
		list.add(root.val);
		list_queue.add(list);
		sum_queue.addFirst(root.val);
		node_queue.addFirst(root);

		while (!node_queue.isEmpty()) {

			TreeNode node = node_queue.pollFirst();
			int num = sum_queue.pollFirst();
			List<Integer> temp_list = new LinkedList<Integer>();
			temp_list.addAll(list_queue.pollFirst());

			if (node.left == null && node.right == null&&sum==num) 
					result.add(temp_list);
				
			
			if (node.left != null) {

				node_queue.addLast(node.left);

				sum_queue.addLast(node.left.val + num);

				List<Integer> left_list = new LinkedList<Integer>();
				left_list.addAll(temp_list);
				left_list.add(node.left.val);
				list_queue.add(left_list);

			}
			if (node.right != null) {

				node_queue.addLast(node.right);

				sum_queue.addLast(node.right.val + num);

				List<Integer> right_list = new LinkedList<Integer>();
				right_list.addAll(temp_list);
				right_list.add(node.right.val);
				list_queue.add(right_list);
			}
		}

		return result;
    }
}
