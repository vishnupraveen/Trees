/*
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

        For example:
        Given binary tree [3,9,20,null,null,15,7],
        3
        / \
        9  20
        /  \
        15   7
        return its bottom-up level order traversal as:
        [
        [15,7],
        [9,20],
        [3]
        ]*/





package leetcode;
import java.util.*;
public class LeetCode_107 {

    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {


            List<List<Integer>> solution = new LinkedList<>();
            if (root == null)
                return solution;
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                List<Integer> levelList = new LinkedList<>();
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    TreeNode temp = q.poll();
                    levelList.add(temp.val);
                    if (temp.left != null) q.add(temp.left);
                    if (temp.right != null) q.add(temp.right);
                }

                solution.add(0, levelList);

            }

            return solution;


        }
    }
}
