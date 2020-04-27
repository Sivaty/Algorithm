package 二叉树;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class _589_N叉树的前序遍历 {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new LinkedList<>();
        if (root == null) return list;
        Node currentNode = root;
        Stack<Node> stack = new Stack<>();
        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                list.add(currentNode.val);
                if (currentNode.children.size() > 1) {
                    for (int i = currentNode.children.size() - 1; i > 0; --i) {
                        stack.push(currentNode.children.get(i));
                    }
                }
            }
            currentNode = stack.pop();
        }
        return list;
    }
}
