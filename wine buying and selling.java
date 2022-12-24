// Date : 24.12.2022
// problem statement: Wine Buying and Selling( Mid Level )
// Time complexity : O(N)
// Space complexity : O(1)



class Solution {
    long wineSelling(int Arr[],int N){
        
        long sum = 0;
        long ans = 0;
        for(int i=0;i <N;i++)
        {
            ans += Math.abs(sum);
            sum = sum + Arr[i];
        }
        
        return ans;
        
    }  
    
}
