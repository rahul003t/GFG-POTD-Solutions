// Date : 20.01.2023
// problem statement: Maximum Weight Node (Easy Level)
// Time complexity : O(N)
// Space complexity : O(N)




class Solution{
    public int maxWeightCell(int N, int Edge[]){
        // Arrays.sort(Edge);
        // return Edge[Edge.length-1];
        // Time Complexity: O(N)
        // Space complexity: O(N)
        
        //creatiig a ans array to store max valus 
        int[] ans = new int[N];
        for(int i=0;i<N;i++)
        {
            if(Edge[i] != -1)
            {
                ans[Edge[i]] +=i;
            }
        }
        int max=0;
        for(int i=0;i<N;i++)
        {
            max = Math.max(max,ans[i]);
        }
        for(int i =N-1;i>=0;i--)
        {
            if(ans[i] == max)
            {
                return i;
            }
        }
        
        return 0;
       
    }
    
    
}
