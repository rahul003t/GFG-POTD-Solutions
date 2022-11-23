
/*

Question: Maximum Sum LCM.
Day: 23.11.2022
Time Complexity : O(sqrt(n))
Space Complexity : O(1)
*/ 




class Solution {
    static long maxSumLCM(int n) {
        long sum=0;
        
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i == 0)
            {
                int a=n/i;
                if(a != i)
                {
                    sum +=(a+i);
                }
                else
                {
                    sum+=a;
                }
            }
                
        }
        
        return sum;
    }
}

