
// Date : 22.12.2022
// problem statement: Burst Balloons (Hard Level  [dp] )
// Time complexity : O(N^2)
// Space complexity : O(N)



class Solution {
  public static int maxCoins(int N, int[] arr) {
    
    int n = arr.length;
    int[] nums = new int[n+2];
    nums[0] = nums[n+1] = 1;
    
    for(int i=0;i<arr.length ;i++)
    {
        nums[i+1] = arr[i];
    }
    
    int[][] dp = new int[n+2][n+2];
    for(int i=n;i>=1;i--)
    {
        for(int j=1;j<=n;j++)
        {
            if(i>j)
            {
                continue;
            }
            int max= Integer.MIN_VALUE;
            for(int k=i;k<=j;k++)
            {
                int cost = (nums[i-1]*nums[k]*nums[j+1])+dp[i][k-1]+dp[k+1][j];
                
                max = Math.max(max,cost);
            }
            dp[i][j] = max;
        }
    }
    
    return dp[1][n];
  }
}
     
