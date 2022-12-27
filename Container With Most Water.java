// Date : 27.12.2022
// problem statement: Container With Most Water( Mid Level )
// Time complexity : O(N)
// Space complexity : O(1)



class Solve{
    
    long maxArea(int A[], int len){
        // return at the end 
        int ans = 0;
        // creating three variable left right and the area's width
        int left,right,width;
        //given height constrant is 100
        for(int height=1;height<=100;height++)
        {
            //start from the left side with increment
            left =0;
            for(int i=0;i<len ;i++)
            {
                if(A[i] >= height)
                {
                    left=i;
                    break;
                }
            }
            
            //start from the end(right) side with decrement
            right =0;
            for(int i=len-1;i>=0;i--)
            {
                if(A[i] >= height)
                {
                    right = i;
                    break;
                }
            }
            
            width = (right-left);
            // we have to return the maximum area
            ans = Math.max(ans,height*width);
        
        }
        
        return ans;
        
    }
    
}
