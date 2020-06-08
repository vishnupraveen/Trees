/*Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

        For example:
        Given binary tree [3,9,20,null,null,15,7],
        3
        / \
        9  20
        /  \
        15   7
        return its zigzag level order traversal as:
        [
        [3],
        [20,9],
        [15,7]
        ]*/



package leetcode;
import java.util.*;
public class LeetCode_103 {

    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

            List<List<Integer>> solution= new ArrayList<>();
            if(root==null)    return solution;
            Queue<TreeNode> q=new LinkedList<>();
            q.add(root);
            int  dir=2;
            while(!q.isEmpty())
            {
                List<Integer> level=new ArrayList<>();
                int size=q.size();
                for(int i=0;i<size;i++)
                {
                    TreeNode temp=q.poll();
                    if(temp.left!=null) q.add(temp.left);
                    if(temp.right!=null) q.add(temp.right);

                    if(dir%2==0)
                    {
                        level.add(temp.val);
                    }
                    else
                    {
                        level.add(0,temp.val);
                    }

                }
                solution.add(level);
                dir++;

            }
            return solution;


        }
    }
}
