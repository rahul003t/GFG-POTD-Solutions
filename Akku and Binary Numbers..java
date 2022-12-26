

// Date : 26.12.2022
// problem Statement: Akku and Binary Numbers( Easy Level)
// Time complexity : O(63^3)
// Space complexity : O(63^3)





class Solution{
    
    void precompute(){
        // Code Here
    }
    long solve(long L, long R){
       
      return fun(R,63,0,0) - fun(L-1,63,0,0);
        
    }
    
    long fun(long n, long idx, int count_setBit,int set)
    {
        if(count_setBit ==3 )
        {
            return 1;
        }
        if(idx < 0)
        {
            return 0;
        }
        long ans =0;
        if(isSet(n,idx))
        {
            ans += fun(n,idx-1,count_setBit+1,set&1);
            ans += fun(n,idx-1,count_setBit,1);
        }
        else
        {
            if(set == 1)
            {
                ans += fun(n,idx-1,count_setBit+1,set);
                ans += fun(n,idx-1,count_setBit,set);
            }
            else
            {
                ans += fun(n,idx-1,count_setBit,set);
            }
        }
        
        return ans;
    }
    
    boolean isSet(long n,long idx)
    {
        long mask = (1l << idx);
        return ( n & mask ) != 0  ;
    }
    
}
