
/*


Question: Longest Bitonic subsequence.
Day: 24.11.2022
Time Complexity : O(N^2)
Space Complexity : O(N)
>>>>  Here the problem is done by the two pointer Approach.

*/


class Solution
{
    public int LongestBitonicSequence(int[] nums)
    {
        
        int n = nums.length;
        int[] min1 = new int[n];
        int[] min2 = new int[n];
        
        for(int i=0;i<n;i++)
        {
            min1[i]=1;
            for(int j=0;j<i;j++)
            {
                if(nums[j] <nums[i]  &&  min1[j]+1 > min1[i])
                {
                    min1[i] = min1[j]+1;
                }
            }
        }
        
        for(int i=n-1;i>=0;i--)
        {
            min2[i]=1;
            for(int j=i+1;j<n;j++)
            {
                if(nums[j] <nums[i]  && min2[j]+1 > min2[i])
                {
                    min2[i] = min2[j]+1;
                }
            }
        }
        
        int  ans =0;
        for(int i=0;i<n;i++)
        {
            ans = Math.max(ans,min1[i]+min2[i]-1);
        }
        
        return ans;
    }
}
