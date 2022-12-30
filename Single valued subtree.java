// Date : 30.12.2022
// problem statement: Single valued subtree (Mid Level)
// Time complexity : O(N)
// Space complexity : O(N)

class Solution
{
    // scoping it global variable
    int count =0;
    public int singlevalued(Node root)
    {
        //int count =0;
        //calling isSingleValue method
        isSingleValue(root);
        return count;
    }
    
    //creating isSingleValue method for searching singleValue Subtree exist or not
    //if exist,return true and  count++
    public boolean isSingleValue(Node root)
    {
       // int count =0;
        //base case
        if(root == null)
        {
            return true;
        }
        //if node exist only one value then we consider it single value subtree
        if(root.left == null && root.right == null)
        {
            count++;
            return true;
        }
        
        // searching single value subtree on the left side
        boolean left = isSingleValue(root.left);
        // searching single value subtree on the right side
        boolean right = isSingleValue(root.right);
        //checking if subtree exist multiple value
        if(left && right)
        {
            //checking if subtree exist multiple value
            if(root.left != null && root.data != root.left.data)
            {
                return false;
            }
            //checking if subtree exist multiple value
            if(root.right != null && root.data != root.right.data)
            {
                return false;
            }
            //else
            count++;
            return true;
            
        }
        return false;
        
    }
}
