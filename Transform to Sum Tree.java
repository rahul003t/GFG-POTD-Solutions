// Date : 09.01.2022
// problem statement: Last modified bal (Easy Level)
// Time complexity : O(N)
// Space complexity : O(N)

class Solution{
    public void toSumTree(Node root){
         //add code here.
         addRoots(root);
         
    }
    
    public static int addRoots(Node root)
    {
        //if there is no roots return 0
        if(root == null)
        {
            return 0;
        }
        //storing roots data
        int x = root.data;
        //calculating roots (left+right) data
        root.data = addRoots(root.left)+addRoots(root.right);
        
        //return own roots data + (left+right) data
        return root.data+x;
    }
}
