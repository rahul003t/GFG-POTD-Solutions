// Date : 11.01.2023
// problem statement: Minimize the sum (Easy Level)
// Time complexity : O(N)
// Space complexity : O(N)


class Solution {
    long minimizeSum(int N, int arr[]) {
        // code here
        // as question mentioned minimize the sum ,I am using PriorityQueue 
        // as it use meanHeap in very efficient way.
        long ans =0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //itterate the array and all elemnets in the queue
        for(int i: arr)
        {
            pq.add(i);
        }
        // while there is more than a single element in the list continue the list
        while(pq.size() >= 2)
        {
            //add the curr two element
            int curr = pq.remove()+ pq.remove();
            //adding the element to the answer
            ans += curr;
            pq.add(curr);
        }
        
        return ans;
    }
}
