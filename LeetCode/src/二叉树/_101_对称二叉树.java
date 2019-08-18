package 二叉树;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class _101_对称二叉树 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)   return true;
        Queue<TreeNode> queue = new LinkedList<>();
        List<TreeNode> levelList = new LinkedList<>();
        queue.offer(root);
        int levelCount = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            levelList.add(node);
            levelCount--;
            queue.offer(node.left);
            queue.offer(node.right);
            if (levelCount == 0) {
                levelCount = queue.size();
                if (!levelList.isEmpty() && levelList.get(0) == root){
                    levelList = new LinkedList<>();
                }
                else {
                    if (!isMatching(levelList)) return false;
                    levelList = new LinkedList<>();
                }
            }
        }
        return true;
    }

    private boolean isMatching(List<TreeNode> levelList) {
        Queue<TreeNode> queue = new LinkedList<>();
        int listCount = levelList.size();
        for (int i = 0; i < listCount; i++) {
            queue.offer(levelList.get(i));
        }
        while (!queue.isEmpty() && queue.size() > 1) {
            TreeNode head = ((LinkedList<TreeNode>) queue).getFirst();
            TreeNode end = ((LinkedList<TreeNode>) queue).getLast();
            if ((head == null && end == null) || (head == end)) {
                ((LinkedList<TreeNode>) queue).removeFirst();
                ((LinkedList<TreeNode>) queue).removeLast();
            }
            else {
                return false;
            }
        }
        if (!queue.isEmpty()) return false;
        return true;
    }
}
