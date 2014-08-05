package solutions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import basicStructures.TreeNode;

public class SumToLeafNumbers {
	public int sumNumbers(TreeNode root) {
		if (root==null) return 0;
		int sum = 0;
		Deque<Integer> number = new LinkedList<Integer>();
		Deque<Boolean> leftnode = new LinkedList<Boolean>();
		Deque<Boolean> rightnode = new LinkedList<Boolean>();

		Deque<TreeNode> stack = new ArrayDeque<TreeNode>();

		stack.add(root);

		number.add(root.val);

		leftnode.addFirst(false);

		rightnode.addFirst(false);

		while (!stack.isEmpty()) {
			TreeNode node = stack.peekFirst();
			if (node.left == null && node.right == null) {
				int result = 0;
				Iterator<Integer> iterator = number.descendingIterator();
				while (iterator.hasNext()) {
					result = result * 10 + iterator.next();
				}
				sum += result;
				leftnode.pollFirst();
				rightnode.pollFirst();
				number.pollFirst();
				stack.pollFirst();
			} else if (node.left != null && leftnode.peekFirst() == false) {
				leftnode.pollFirst();
				leftnode.addFirst(true);
				leftnode.addFirst(false);
				rightnode.addFirst(false);
				stack.addFirst(node.left);
				number.addFirst(node.left.val);
			} else if (node.right != null && rightnode.peekFirst() == false) {
				rightnode.pollFirst();
				rightnode.addFirst(true);
				rightnode.addFirst(false);
				leftnode.addFirst(false);
				stack.addFirst(node.right);
				number.addFirst(node.right.val);
			} else {
				stack.pollFirst();
				number.pollFirst();
				leftnode.pollFirst();
				rightnode.pollFirst();
			}
		}
		return sum;
	}
}
