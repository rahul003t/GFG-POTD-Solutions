// Date : 29.12.2022
// problem statement: Asteroid Collision (Mid Level)
// Time complexity : O(N)
// Space complexity : O(N)

class Solution {
    public static int[] asteroidCollision(int N, int[] asteroids) {
        // using stack 
        Stack<Integer> st = new Stack<Integer>();
        //pushig all the array values into the stack
        for(int i=0; i<N; i++)
        {
            st.push(asteroids[i]);
            
            
            while(st.size()>1)
            {
                int curr = st.pop();
                int prev = st.pop();
                
                if(curr<0 && prev>0)
                {
                    if(prev+curr == 0)
                    {
                        continue;
                    }
                    
                    int res = -curr > prev ? curr : prev;
                    st.push(res);
                }
                else
                {
                    st.push(prev);
                    st.push(curr);
                    break;
                }
            }
        }
        int len = st.size();
        int[] ans = new int[len];
        len--;
        while(st.isEmpty() == false)
        {
            ans[len--] = st.pop();
        }
        
        return ans;
    }
}
