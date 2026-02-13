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
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));

        for(ListNode node : lists){
            if(node != null) queue.add(node);
        }
        ListNode dum = new ListNode(0);
        ListNode res = dum;

        while(queue.size() != 0){
            ListNode nextNode = queue.poll();

            res.next = nextNode;
            res = res.next;

            if(nextNode.next != null) queue.add(nextNode.next);
        }
        return dum.next;
    }
}