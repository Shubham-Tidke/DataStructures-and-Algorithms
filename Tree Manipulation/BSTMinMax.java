//Find the node with minimum value in a Binary Search Tree
public class BSTMinMax {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }static node root;
    public static void main(String[] args) {
            root = new node(20);
            root.left = new node(8);
            root.right = new node(22);
            root.left.left = new node(4);
            root.left.right = new node(12);
            root.left.right.left = new node(10);
            root.left.right.right = new node(14);
            System.out.println(getMin(root).data);
            System.out.println(getMax(root).data);
    }
//rightmost node of BST is node with max value
    private static node getMax(node root) {
        if(root == null || (root.left == null && root.right == null))
            return root;
        node current = root;
        while (current.right!=null)
            current = current.right;
        return current;

    }
//leftmost node of BST is node with min value
    private static node getMin(node root) {
        if(root == null || (root.left == null && root.right == null))
            return root;
        node current = root;
        while (current.left!=null)
            current = current.left;
        return current;

    }
}
