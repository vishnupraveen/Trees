/*
Given a binary tree, find its minimum depth.

        The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

        Note: A leaf is a node with no children.

        Example:

        Given binary tree [3,9,20,null,null,15,7],

        3
        / \
        9  20
        /  \
        15   7
        return its minimum depth = 2.

*/

package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode_111 {
    class Solution {
        public int minDepth(TreeNode root) {

            if(root==null)
                return 0;
            if(root.left==null&&root.right==null)
                return 1;
            int depth=0;
            Queue<TreeNode> q=new LinkedList<>();
            q.add(root);
            while(!q.isEmpty())
            {

                ++depth;
                int size=q.size();
                for(int i=0;i<size;i++)
                {
                    TreeNode temp=q.poll();
                    // System.out.print("level "+depth);
                    // System.out.println(" "+temp.val);
                    if(temp.left==null&&temp.right==null)
                    {
                        return depth;
                    }
                    if(temp.left!=null)  q.add(temp.left);
                    if(temp.right!=null)  q.add(temp.right);

                }


            }


            return depth;


        }
    }
}
