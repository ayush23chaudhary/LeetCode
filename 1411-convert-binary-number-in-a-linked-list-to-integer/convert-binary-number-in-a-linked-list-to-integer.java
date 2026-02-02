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
    public int getDecimalValue(ListNode head) {
        List<Integer> list= new ArrayList<>();
        int c=0;
        while(head!=null){
            list.add(head.val);
            head=head.next;
            c++;
        }
        c--;
        int n=0;
        for(int i:list){
            if(i==1){
                n+=Math.pow(2,c);
            }
            c--;
        }
        return n;
        
    }
}