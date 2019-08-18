package 链表;

public class _21_合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode header = new ListNode(-1);
        ListNode currentHead = header;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                currentHead.next = l1;
                l1 = l1.next;
            }
            else {
                currentHead.next = l2;
                l2 = l2.next;
            }
            currentHead = currentHead.next;
        }
        if (l1 == null) {
            currentHead.next = l2;
        }
        else if (l2 == null) {
            currentHead.next = l1;
        }
        return header.next;
    }
}
