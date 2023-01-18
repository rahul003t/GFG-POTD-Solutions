// Date : 18.01.2023
// problem statement: Find the first node of loop in linked list (Easy Level)
// Time complexity : O(N)
// Space complexity : O(N)




class Solution {
    //Function to find first node if the linked list has a loop.
    public static int findFirstNode(Node head){
        //code here
        //here we are using fast and sloe method 
        // if the node is empty return -1
        Node slow=head;
        Node fast= head;
        
        while(slow != null && fast != null && fast.next != null )
        {
            slow= slow.next;
            fast=fast.next.next;
            if(slow== fast)
            {
                break;
            }
        }
        if(slow != fast)
        {
            return -1;
        }
        slow=head;
        
        while(slow != fast)
        {
            slow=slow.next;
            fast= fast.next;
        }
        
        return slow.data;
    }
}
