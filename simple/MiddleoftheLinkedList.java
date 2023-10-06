package simple;

public class MiddleoftheLinkedList {


     public class ListNode {
         int val;
         ListNode next;

         ListNode() {
         }

         ListNode(int val) {
             this.val = val;
         }

         ListNode(int val, ListNode next) {
             this.val = val;
             this.next = next;
         }
     }

    class Solution {
        public ListNode middleNode(ListNode head) {

            ListNode mid = head;
            ListNode fwd = head;
            while ( fwd != null && fwd.next != null){
                mid = mid.next;
                fwd = fwd.next.next;

            }
         return mid;
        }
    }
}
