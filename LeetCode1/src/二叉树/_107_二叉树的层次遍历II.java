package 二叉树;
/*
* https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
* */

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _107_二叉树的层次遍历II {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if (root == null) return list;
        List<Integer> levelList = new LinkedList<>();
        int levelSize = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            levelList.add(node.val);
            levelSize--;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            if (levelSize == 0) {
                levelSize = queue.size();
                list.add(0,levelList);
                levelList = new LinkedList<>();
            }
        }
        return list;
    }
}
