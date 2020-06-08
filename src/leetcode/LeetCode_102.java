/*Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

        For example:
        Given binary tree [3,9,20,null,null,15,7],
        3
        / \
        9  20
        /  \
        15   7
        return its level order traversal as:
        [
        [3],
        [9,20],
        [15,7]
        ]*/


package leetcode;
import java.util.*;
public class LeetCode_102 {
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {


            List<List<Integer>> solution=new ArrayList<>();

            if(root==null)
                return solution;
            Queue<TreeNode> q=new LinkedList<>();
            q.add(root);
            while(!q.isEmpty())
            {

                int size=q.size();
                List<Integer> level=new ArrayList<>();
                for(int i=0;i<size;i++)
                {
                    TreeNode temp=q.poll();
                    level.add(temp.val);
                    if(temp.left!=null) q.add(temp.left);
                    if(temp.right!=null) q.add(temp.right);
                }
                solution.add(level);

            }
            return solution;

        }
    }
}
