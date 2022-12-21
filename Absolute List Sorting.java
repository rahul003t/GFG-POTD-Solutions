// Date : 21.12.2022
// problem statement: Absolute List Sorting (Easy Level)
// Time complexity : O(N)
// Space complexity : O(1)




class Solution
{
	Node sortList(Node head) {
		//return null if head is emptyt
		if(head == null || head.next == null)
		{
		    return head;
		}
		
		Node temp=head,prev=head;
		// storing head's data in element ,for no data loses
		int element = head.data;
		if(head.data < 0)
		{
		    prev= head;
		    temp = temp.next;
		}                                                   // Time complexity : O(N)
		                                                    // Space complexity : O(1)
		while(temp != null)
		{
		    if(temp.data >= 0)
		    {
		        prev = temp;
		        temp = temp.next;
		    }
		    else{
		        //swap vaalues
		        prev.next = temp.next;
		        temp.next = head;
		        head = temp;
		        temp = prev.next;
		        
		    }
		}
		return head;
	}
}
