// Date : 28.12.2022
// problem statement: Largest subtree sum in a tree( Hard level)
// Time complexity : O(N)
// Space complexity : O(N)

class Solution {
    public static int findLargestSubtreeSum(Node root) {
        //creating maxsum array and initialize with min value just to return 0th element
        //which is the LargestSubtreeSum
        int[] maxSum = new int[]{Integer.MIN_VALUE};
        
        //calling findMax fun
        findMax(root,maxSum);
        return maxSum[0];
    }
    //creating findMax fun to find the largestsubTree sum
    private static int findMax(Node root,int[] maxSum)
    {
        // if root is null return 0
        if(root == null)
        {
            return 0;
        }
        //find recursively the leftree sum
        int Lsum = findMax(root.left,maxSum);
        //find recursively the rightree sum
        int Rsum = findMax(root.right,maxSum);
        //total sum
        int total = Lsum+Rsum+root.data;
        // find the max of maxSum[0]
        maxSum[0] = Math.max(maxSum[0],total);
        return total;
    }
}
        

