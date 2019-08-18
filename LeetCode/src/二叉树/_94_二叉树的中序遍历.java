package 二叉树;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _94_二叉树的中序遍历 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        while (currentNode != null || !stack.isEmpty()) {
            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            else {
                currentNode = stack.pop();
                list.add(currentNode.val);
                currentNode = currentNode.right;
            }
        }
        return list;
    }
}
