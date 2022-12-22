

// Date : 22.12.2022
// problem statement:Zero Sum Subarrays (Mid Level)
// Time complexity : O(N)
// Space complexity : O(N)







class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //long count = 0;
        //HashMap<Integer,Integer> map = new HashMap<>();
        
        //return type is long
        HashMap <Long , Long> map =  new HashMap<>();
        
        long sum=0,count=0;
        //itterate the array and find subarray of sum zero
        for(long i : arr)
        {
            sum += i;
            
            // if map contains the key value then add 
            if(map.containsKey(sum))
            {
                count += map.get(sum);
            }
            // while itterating if sum=0 then add 1 to the count value  
            if(sum ==0)
            {
                count++;
            }
            
            map.put(sum,map.getOrDefault(sum,0l) + 1l);
        }
        
        return count;
    }
}
