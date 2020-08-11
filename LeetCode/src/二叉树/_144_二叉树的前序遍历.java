package 二叉树;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _144_二叉树的前序遍历 {

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return null;
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()){
            while (node != null) {
               list.add(node.val);
               stack.push(node.right);
               node = node.left;
            }
            node = stack.pop();
        }
        return list;
    }
}
