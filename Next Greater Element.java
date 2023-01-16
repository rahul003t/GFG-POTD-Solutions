// Date : 16.01.2023
// problem statement:Next Greater Element (Mid Level)
// Time complexity : O(N)
// Space complexity : O(N)






class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
        // Your code here
        //creating a Long array to store the answer value
        long[] ans = new long[n];
      
        //here I using stak operation so i cretae a stack
        Stack<Long> st=new Stack<>();
        
        //traversing from the last element of the array
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek() < arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                ans[i] = -1;
            }
            else
            {
                ans[i] = st.peek();
            }
            
            st.push(arr[i]);

        }
        
        return ans;
    } 
}
