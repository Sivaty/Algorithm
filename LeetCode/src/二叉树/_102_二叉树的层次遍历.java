package 二叉树;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _102_二叉树的层次遍历 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if (root == null) return list;
        List<Integer> levelList = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        int levelSize = 1;
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
                list.add(levelList);
                levelList = new LinkedList<>();
            }
        }
        return list;
    }
}
