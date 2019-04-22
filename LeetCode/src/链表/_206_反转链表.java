package 链表;

public class _206_反转链表 {
    //递归
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    //非递归（迭代）
    public ListNode reverseList2(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode tempNode = head.next;
            head.next = newHead;
            newHead = head;
            head = tempNode;
        }
        return newHead;
    }
}
