/*Given a binary tree, return all root-to-leaf paths.

        Note: A leaf is a node with no children.

        Example:

        Input:

        1
        /   \
        2     3
        \
        5

        Output: ["1->2->5", "1->3"]

        Explanation: All root-to-leaf paths are: 1->2->5, 1->3*/


package leetcode;
import java.util.*;
public class LeetCode_257 {
    class Solution {
        public List<String> binaryTreePaths(TreeNode root) {

            List<String> sol=new ArrayList<>();
            if(root==null) return sol;
            findPaths(root, sol , "");
            return sol;

        }
        public void findPaths(TreeNode root , List<String> sol, String str )
        {

            if(root==null)
                return;
            str=str+String.valueOf(root.val);
            if(root.left==null&&root.right==null)
            { sol.add(str);
                return;}
            str=str+"->";
            findPaths(root.left, sol , str);
            findPaths(root.right, sol , str);


        }
    }
}
