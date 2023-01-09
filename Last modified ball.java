// Date : 09.01.2022
// problem statement: Last modified bal (Easy Level)
// Time complexity : O(N)
// Space complexity : O(1)



class Solution {
    int solve(int N, int[] A) {
        // code here
        
        //traversing  the array from the right side as the question given with decrementing
        for(int i=N-1; i>=0; i--)
        {
            //if arrayindex is less than 1  return the the value
            if(A[i] < 9)
            {
                //as given array is 1 base indexing rteunn index+1
                return i+1;
            }
        }
        //if all array contains >=9 return 0
        return 0;
    }
};
