package solutions;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import basicStructures.TreeNode;

public class BinaryTreeOrderLevelTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<Integer> list= new LinkedList<Integer>();
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        Deque<TreeNode> node_queue=new LinkedList<TreeNode>();

        
        if (root==null) return result;
        
        list.add(root.val);
        result.add(new LinkedList<Integer>(list));
        list.clear();
        node_queue.addFirst(root);
        int curr_layer=1;
        int next_layer=0;
        
        while(!node_queue.isEmpty()){
           	TreeNode node = node_queue.pollFirst();
            curr_layer--;
            
            if (node.left!=null){
                node_queue.add(node.left);
                next_layer++;
                list.add(node.left.val);
            }
            if (node.right!=null){
                node_queue.addLast(node.right);
                next_layer++;
                list.add(node.right.val);
            }
            if (curr_layer==0&&list.size()>0){
                result.add(new LinkedList<Integer>(list));
                list.clear();
                curr_layer=next_layer;
                next_layer=0;
            }
        }
        
        return result;
    }
	}
