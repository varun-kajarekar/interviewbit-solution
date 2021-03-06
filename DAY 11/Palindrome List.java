


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode A) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ListNode a  = A;
        while(a!=null){
            arr.add(a.val);
            a = a.next;
        }
        ArrayList<Integer> reverse_arr = new ArrayList<Integer>();
        for(int i = 0;i<arr.size();i++){
            reverse_arr.add(arr.get(arr.size()-1-i));
        }
        int out = 0;
        for(int j = 0;j<arr.size()/2+1;j++){
            if(arr.get(j)==reverse_arr.get(j)){
                out = 1;
            }
            else {
                return 0;
            }
        }
        return out;
    }
}



//  OR




/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode A) {
        ListNode slow = A;
        int ispalin = 1;
        Stack<Integer> stack = new Stack<Integer>();
 
        while (slow != null) {
            stack.push(slow.val);
            slow = slow.next;
        }
 
        while (A != null) {
 
            int i = stack.pop();
            if (A.val == i) {
                ispalin = 1;
            }
            else {
                ispalin = 0;
                break;
            }
            A = A.next;
        }
        return ispalin;
    }
}
