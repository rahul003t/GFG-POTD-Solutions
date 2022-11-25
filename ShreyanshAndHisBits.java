

/*

Question: Shreyansh and his bits
Day: 25.11.2022
Time Complexity : O(N)
Space Complexity : O(1)

*/



class Solution{
    
    long ncr(int n,int r){
        long ans=1;
        for(int i=1;i<=r;i++){
            ans=ans*(n-r+i)/i;
        }
        return ans;
    }
    
    long count(long n)
    {
        // Code Here
        
        String s=Long.toBinaryString(n);
        int c=0;
        long ans=0;
        int ind=0;
        for(int i=s.length()-1;i>=0;i--){
            ind++;
            if(s.charAt(i)=='1')
               {
                   c++;
                   if(ind!=c){
                       ans+=ncr(ind-1,c);
                   }
               }
        }
        return ans;
    }
}
