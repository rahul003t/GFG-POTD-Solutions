// Date : 07.01.2022
// problem statement: Flattening a Linked List (Easy Level)
// Time complexity : O(N*M)
// Space complexity : O(1)



    the flattened linked list. */
class GfG
{
    //creating a merge fuction to merge two LinkedList
    Node mergeTwoList(Node a,Node b)
    {
        Node temp =  new Node(0);
        Node res = temp;
        // 
        while(a != null && b !=  null)
        {
            // if a node is lesser than b -->SWAP
            if(a.data < b.data)
            {
                temp.bottom=a;
                temp = temp.bottom;
                a = a.bottom;
            }
            else
            {
              temp.bottom =b;
              temp=temp.bottom;
              b=b.bottom;
            }
        }
        if(a != null)
        {
            temp.bottom=a;
            
        }
        else
        {
            temp.bottom=b;
        }
        return res.bottom;
    }
 
    
    Node flatten(Node root)
    {
	// Your code here
    	if(root == null || root.next == null)
    	{
    	    return root;
    	}
    	
    	root.next = flatten(root.next);
    	// recursive calling of merge function
    	root = mergeTwoList(root,root.next);
    	
    	return root;
    }
}
