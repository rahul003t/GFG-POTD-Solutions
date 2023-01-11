// Date : 11.01.2023
// problem statement: Make array elements unique (Mid Level)
// Time complexity : O(NLogN)
// Space complexity : O(1)

class Solution {
    public long minIncrements(int[] arr, int N) {
        // Code here
        long ans =0;
        Arrays.sort(arr);
        
        for(int i=1;i<N;i++)
        {
            if(arr[i] <= arr[i-1])
            {
                int diff = arr[i-1] - arr[i];
                ans += diff+1;
                arr[i] = arr[i-1]+1;
            }
        }
        
        return ans;
        
    }
}
