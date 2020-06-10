/*Given a binary tree, determine if it is a valid binary search tree (BST).

        Assume a BST is defined as follows:

        The left subtree of a node contains only nodes with keys less than the node's key.
        The right subtree of a node contains only nodes with keys greater than the node's key.
        Both the left and right subtrees must also be binary search trees.


        Example 1:

        2
        / \
        1   3

        Input: [2,1,3]
        Output: true
        Example 2:

        5
        / \
        1   4
        / \
        3   6

        Input: [5,1,4,null,null,3,6]
        Output: false
        Explanation: The root node's value is 5 but its right child's value is 4.*/



package leetcode;
import java.util.Stack;

public class LeetCode_98 {

    class Solution {
        public boolean isValidBST(TreeNode root) {

            Stack<TreeNode> stk=new Stack<>();
            double left_child=-Double.MAX_VALUE;

            while(!stk.empty()||root!=null)
            {

                while(root!=null)
                {

                    stk.push(root);
                    root=root.left;

                }
                root=stk.pop();
                if(root.val<=left_child)  return false;
                left_child=root.val;
                root=root.right;
            }
            return true;



        }
        //reccursive solution
        public boolean isValidBSTR(TreeNode root) {

            return isBST(root,null,null);

        }

        public boolean isBST(TreeNode root, Integer max,Integer min)
        {
            if(root==null)
                return true;
            if(max!=null&&max<=root.val)
                return false;
            if(min!=null&&min>=root.val)
                return false;
            return isBST(root.left,root.val,min)&&isBST(root.right,max,root.val);



        }

    }
}
