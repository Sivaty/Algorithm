package 链表;

public class _83_删除排序链表中的重复元素 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode currentNode = head;
        int oldValue = head.val;
        while (currentNode.next != null) {
            if (currentNode.next.val == oldValue) {
                currentNode.next = currentNode.next.next;
            }
            else {
                currentNode = currentNode.next;
                oldValue = currentNode.val;
            }
        }
        return head;
    }
}
