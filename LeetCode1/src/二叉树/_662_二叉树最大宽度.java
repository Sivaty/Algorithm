package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

public class _662_二叉树最大宽度 {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int maxWidth = 1;
        int levelSize = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            levelSize--;
            if (node.left != null) {
                node = node.left;
            }
            if (node.right != null) {
                node = node.right;
            }
            if (levelSize == 0) {
                levelSize = queue.size();
                maxWidth = levelSize > maxWidth ? levelSize : maxWidth;
            }
        }
        return maxWidth;
    }
}
