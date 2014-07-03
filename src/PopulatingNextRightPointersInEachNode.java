import basicStructures.TreeLinkNode;


public class PopulatingNextRightPointersInEachNode {
    public void connect(TreeLinkNode root) {
        TreeLinkNode left = root;
        while (left!=null){
            TreeLinkNode level=left;
            while (level!=null){
                 if (level.left!=null) level.left.next=level.right;
                 if (level.right!=null&&level.next!=null) level.right.next=level.next.left;
                 level=level.next;
            }
            left=left.left;
        }
    }
}
