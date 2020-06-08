/*
Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
        Example 1:
        Input:
        3
        / \
        9  20
        /  \
        15   7
        Output: [3, 14.5, 11]
        Explanation:
        The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].

*/



package leetcode;

import java.util.*;

public class LeetCode_637 {

    class Solution {

        double sum;
        int nodes;
        public List<Double> averageOfLevels(TreeNode root) {

            List<Double> list=new ArrayList<>();

            Queue<TreeNode> q=new LinkedList<>();
            q.add(root);

            while(!q.isEmpty())
            {
                double sum=0.0;
                int size=q.size();


                for(int i=0;i<size;i++)
                {

                    TreeNode temp=q.poll();
                    sum+=temp.val;
                    if(temp.left!=null)
                    {
                        q.add(temp.left);
                    }
                    if(temp.right!=null)
                    {
                        q.add(temp.right);
                    }
                }
                double avg=sum/size;
                list.add(avg);
            }
            return list;

        }
    }
}
