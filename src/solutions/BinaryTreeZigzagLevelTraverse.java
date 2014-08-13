package solutions;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import basicStructures.TreeNode;

public class BinaryTreeZigzagLevelTraverse {
	
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
        int layer=2;
        
        while(!node_queue.isEmpty()){
           	TreeNode node = node_queue.pollFirst();
            curr_layer--;
            
            if (node.left!=null){
                node_queue.add(node.left);
                next_layer++;
                if (layer%2==1)
                list.add(node.left.val);
                else list.add(0,node.left.val);
            }
            if (node.right!=null){
                node_queue.addLast(node.right);
                next_layer++;
                if (layer%2==1)
                list.add(node.right.val);
                else list.add(0,node.right.val);
            }
            if (curr_layer==0&&list.size()>0){
                result.add(new LinkedList<Integer>(list));
                list.clear();
                curr_layer=next_layer;
                next_layer=0;
                layer++;
            }
        }        
        return result;
    }
}
