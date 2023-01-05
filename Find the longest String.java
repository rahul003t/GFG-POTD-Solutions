// Date : 05.01.2023
// problem statement: Find the longest String (Mid Level)
// Time complexity : O(NlogN)
// Space complexity : O(N)


class Solution {
    public static String longestString(int n, String[] arr) {
        // code here
        Arrays.sort(arr, (a,b)->a.length()==b.length() ?a.compareTo(b) :a.length()-b.length());
        HashSet<String> hs = new HashSet<>();
        hs.add(arr[0]);
        
        String s = "";
        
        if(arr[0].length()>1)
        {
            return s;
        }    
        s=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i].length()==1)
            {
                hs.add(arr[i]);
            }    
            
            if(hs.contains(arr[i].substring(0, arr[i].length()-1)))
            {
                hs.add(arr[i]);
                if(arr[i].length()>s.length())
                {
                    s=arr[i];   
                }
                     
            }    
            
        }
        return s;
    }
}
        
