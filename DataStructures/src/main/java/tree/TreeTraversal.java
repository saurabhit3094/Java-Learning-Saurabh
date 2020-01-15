package tree;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

public class TreeTraversal {


    public static void main(String[] args) {

        MyTreeNode treeNode = new MyTreeNode(1);
        treeNode.left = new MyTreeNode(2);
        treeNode.right = new MyTreeNode(3);
        treeNode.right.left = new MyTreeNode(2);
        treeNode.right.right = new MyTreeNode(3);
        treeNode.right.right.right = new MyTreeNode(3);
        treeNode.left.left = new MyTreeNode(2);
        treeNode.left.right = new MyTreeNode(2);
        treeNode.left.right.right = new MyTreeNode(2);
        treeNode.left.right.left = new MyTreeNode(3);
        treeNode.left.right.left.left = new MyTreeNode(3);
        treeNode.left.right.left.right = new MyTreeNode(3);
        treeNode.left.right.left.left.left = new MyTreeNode(3);
        treeNode.left.right.left.left.right = new MyTreeNode(3);
        treeNode.left.right.left.right.left = new MyTreeNode(3);
        treeNode.left.right.left.right.right = new MyTreeNode(3);


    }

    public void printInOrderTraversal(MyTreeNode root){
        //root in between left and right

    }

    public void printPostOrderTraversal(MyTreeNode root){
        //root after left and right

    }

    public void printPreOrderTraveral(MyTreeNode root){
        //root before left and right

    }

    public void printInOrderTraversalWithoutRecursion(MyTreeNode root){
        //root in between left and right using stack

    }

    public void printPostOrderTraversalWithoutRecursion(MyTreeNode root){
        //root after left and right using stack

    }

    public void printPreOrderTraveralWithoutRecursion(MyTreeNode root){
        //root before left and right using stack

    }


}



class MyTreeNode{


    public MyTreeNode left,right;
    int val;

    public MyTreeNode(int val){
        this.val = val;
    }

}