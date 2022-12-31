// Date : 31.12.2022
// problem statement: Find minimum number of Laptops required (Mid Level)
// Time complexity : O(NlogN)
// Space complexity : O(1)



class Solution {
    public int minLaptops(int N, int[] start, int[] end) {
        // code here
        Arrays.sort(start);
        Arrays.sort(end);
        
        int laptops=1,count=1,i=1,j=0;
        
        while(i<N && j<N)
        {
            if(start[i] < end[j])
            {
                count++;
                i++;
            }
            else
            {
                count--;
                j++;
            }
            
            laptops = Math.max(count,laptops);
        }
        
        return laptops;
    }
}
