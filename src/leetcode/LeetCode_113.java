
/*Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

        Note: A leaf is a node with no children.

        Example:

        Given the below binary tree and sum = 22,

        5
        / \
        4   8
        /   / \
        11  13  4
        /  \    / \
        7    2  5   1
        Return:

        [
        [5,4,11,2],
        [5,8,4,5]
        ]*/

package leetcode;
import java.util.*;
public class LeetCode_113 {
    class Solution {
        public List<List<Integer>> pathSum(TreeNode root, int sum) {

            List<List<Integer>> solution=new ArrayList<>();
            findPaths(root, sum, new ArrayList<Integer>(),solution);

            return solution;
        }

        public void findPaths(TreeNode root, int sum, List<Integer> current,List<List<Integer>> solution )
        {
            if(root==null)
                return ;

            current.add(root.val);
            if(root.val==sum&&root.left==null&&root.right==null)
            {
                solution.add(current);
                return;
            }
            findPaths(root.left, sum-root.val, new ArrayList<Integer>(current),solution);
            findPaths(root.right, sum-root.val, new ArrayList<Integer>(current),solution);
        }
    }
}
