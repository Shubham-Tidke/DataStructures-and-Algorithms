/*
You are given the root of a binary search tree (BST) and an integer val.
Find the node in the BST that the node's value equals val and return the subtree rooted with that node. 
If such a node does not exist, return null.
ONLY implement the RECURSIVE solution.
eg.
root =[4,2,7,1,3] val = 2
output = [2,1,3]
 */
import java.util.*;
public class BinarySearchTree {
	class node{
		int data;
		node left;
		node right;
	}
	node root;
	public BinarySearchTree() {
		root = null;
	}
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insertNode(4);
		tree.insertNode(2);
		tree.insertNode(7);
		tree.insertNode(1);
		tree.insertNode(3);
	//	tree.display();
	//	System.out.println();
		int SearchVal = 2;
		//printing tree from searched value
		print(tree.search(tree.root,SearchVal));
	}
	
	//Printing BST
	private void display() {
		print(root);
	}
	private static void print(node root)
	//Inorder printing[root,left node,right node]
	{
		if(root!=null)
		{
			System.out.print(root.data + " ");
			print(root.left);
			print(root.right);
		}
	}
	
	//Searching in BST
	private node search(node root, int searchVal) {
		if(root==null || root.data == searchVal)
			return root;
		if(searchVal < root.data) {
			return search(root.left,searchVal);
		}
		return search(root.right,searchVal);
	}
	
	//Inserting in BST
	private void insertNode(int i) {		
		root =  insertVal(root,i);
	}
	private node insertVal(node root, int i)
	//if root is null,new element is root
	{
		if(root == null)
		{
			root = new node();
			root.data = i;
			return root;
		}
	//if input < root,traverse to left for inserting,else traverse right
		if(i < root.data)
		{
			root.left = insertVal(root.left, i);
		}
		else
			root.right = insertVal(root.right, i);
		return root;
	}
}
