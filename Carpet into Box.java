// Date : 19.01.2023
// problem statement: Carpet into Box (Mid Level)
// Time complexity : O(max(logA,logB)
// Space complexity : O(1)

class Solution{
    int carpetBox(int A, int B, int C, int D) { 
        //code here
        int step=0;
        // creating l1 and b1 for the length and breadth of crapet
        int l1=Math.max(A,B);
        int b1=Math.min(A,B);
        
        //creating l,b for the length and breadth of the box
        int l= Math.max(C,D);
        int b= Math.min(C,D);
        
        while(l1>l || b1>b)
        {
            //when both the length and breadth of the carpet max then divide it by 2
            if(l1>l && b1>b)
            {
                l1/=2;
            }
            //when only the length of the carpet it greater
            else if(l1>l)
            {
                l1/=2;
            }
            else
            {
                b1/=2;
            }
            
            A=l1;
            B=b1;
            l1=Math.max(A,B);
            b1=Math.min(A,B);
            
            step++;
        }
        
        return step;
        
        
    }
   
}
