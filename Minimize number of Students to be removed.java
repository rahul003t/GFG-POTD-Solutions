// Date : 03.01.2023
// problem statement: Minimize number of Students to be removed (Mid Level)
// Time complexity : O(NlogN)
// Space complexity : O(1)




class Solution {
    public int removeStudents(int[] H, int N) {
        
        int LTS = lengthofLTS(H);
        return N-LTS;
    }
    public static int lengthofLTS(int[] H)
    {
        int[] a = new int[H.length+1];
        Arrays.fill(a,Integer.MAX_VALUE);
        a[0] = Integer.MIN_VALUE;
        
        for(int h: H)
        {
            int idx = search(a,h);
            a[idx+1] = h;
        }
        
        
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i] != Integer.MAX_VALUE)
            {
                return i;
            }
            
        }
        return 0;
    }
    
    public static int search(int[] a, int m)
    {
        int lo=0,hi=a.length-1,ans=0;
        while(lo <= hi)
         {  
            int mid= lo +(hi-lo)/2;
            if(a[mid] < m)
            {
                lo = mid+1;
                ans = Math.max(ans,mid);
            }
            else
            {
                hi = mid-1;
            }
        }
        return ans;
    }
};
