/*
Given the root of a binary tree, each node has a value from 0 to 25 representing the letters 'a' to 'z': a value of 0 represents 'a', a value of 1 represents 'b', and so on.

        Find the lexicographically smallest string that starts at a leaf of this tree and ends at the root.

        (As a reminder, any shorter prefix of a string is lexicographically smaller: for example, "ab" is lexicographically smaller than "aba".  A leaf of a node is a node that has no children.)



        Example 1:



        Input: [0,1,2,3,4,3,4]
        Output: "dba"
        Example 2:



        Input: [25,1,3,1,3,0,2]
        Output: "adz"






*/


package leetcode;

public class LeetCode_988 {

    class Solution {
        String sol="~";
        public String smallestFromLeaf(TreeNode root) {

            dfs(root, new StringBuffer());
            return sol;

        }

        public void dfs(TreeNode root, StringBuffer current)
        {

            if(root==null)
                return;
            current.append((char)('a'+root.val));

            if(root.left==null&&root.right==null)
            {
                current.reverse();
                String c=current.toString();
                current.reverse();
                if(c.compareTo(sol)<0)
                {
                    sol=c;
                }

            }

            dfs(root.left,  current);
            dfs(root.right, current);
            current.deleteCharAt(current.length()-1);


        }
    }
}
