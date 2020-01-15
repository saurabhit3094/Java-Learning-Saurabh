package recursion;

// This problem is taken from leet code
// https://leetcode.com/problems/longest-univalue-path/
// short desc  : In a binary tree, find the length of the longest path where each node in the path has the same value.


public class longestUnivaluePath {

    int maxLength = Integer.MIN_VALUE;

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


        longestUnivaluePath univaluePath = new longestUnivaluePath();
        System.out.println(univaluePath.findLongestUnivaluePath(treeNode));

    }

    private int findLongestUnivaluePath(MyTreeNode root) {
        if(root == null) return 0;
        helper(root,root.val+1);
        return maxLength;

    }

    public int helper(MyTreeNode node,int prevVal){
        if(node == null) return 0;
        int left = helper(node.left,node.val);
        int right = helper(node.right,node.val);
        maxLength = Math.max(maxLength,(left+right));
        if(node.val == prevVal) return Math.max(left,right)+1;
        return 0;
    }

}

class MyTreeNode {


    public MyTreeNode left, right;
    int val;

    public MyTreeNode(int val) {
        this.val = val;
    }

}
