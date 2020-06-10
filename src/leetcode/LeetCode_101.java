/*Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

        For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

        1
        / \
        2   2
        / \ / \
        3  4 4  3


        But the following [1,2,2,null,3,null,3] is not:

        1
        / \
        2   2
        \   \
        3    3*/



package leetcode;

public class LeetCode_101 {

    class Solution {
        public boolean isSymmetric(TreeNode root) {

            if(root==null)
            {
                return true;
            }
            return isSymmetric(root.left,root.right);
        }

        public boolean isSymmetric(TreeNode left, TreeNode right)
        {
            if(left==null||right==null)
                return left==null&&right==null;
            else if(left.val==right.val)
            {
                return isSymmetric(left.left,right.right)&&isSymmetric(left.right,right.left);
            }

            return false;


        }



    }
}
