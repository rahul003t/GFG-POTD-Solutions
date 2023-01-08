// Date : 08.01.2022
// problem statement:Absolute difference divisible by K (Easy Level)
// Time complexity : O(N)
// Space complexity : O(1)

class Solution {
	static long countPairs(int n, int[] arr, int k) {
		// code here
		long ans = 0;
		long[] rem = new long[k];
		
		for(int i=0; i<n;i++)
		{
		    rem[arr[i]%k]++;
		}
		
		for(int i=0; i<k;i++)
		{
		    ans += ((rem[i]-1) * (rem[i]))/2;
		}
		
		return ans;
	}
}
