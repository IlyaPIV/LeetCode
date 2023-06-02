package problems.easy.p0876;



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class MySolution {
    public ListNode middleNode(ListNode head) {

        int currPos = 1;
        int middlePos = 1;
        ListNode middle = head;
        ListNode curr = head;
        while (curr.next != null) {
            currPos++;
            curr = curr.next;
            if (middlePos * 2 <= currPos) {
                middlePos++;
                middle = middle.next;
            }
        }

        return middle;
    }
}