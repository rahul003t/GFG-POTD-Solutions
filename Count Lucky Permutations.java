// Date : 13.01.2023
// problem statement: Absolute List Sorting (Easy Level)
// Time Complexity :- O(n*n*2^n);
// Space Complexity :- O(n*n*2^n);

class Solution {
    // Time Complexity :- O(n*n*2^n);
    // Space Complexity :- O(n*n*2^n);
    long luckyPermutations(int N, int M, int arr[], int[][] graph) {
        // Code here
        HashSet<Integer>[] grap = new HashSet[N+1];
        for(int i=0;i<=N;i++) grap[i] = new HashSet<>();
        for(int[] g : graph) 
        {
            grap[g[0]].add(g[1]);
            grap[g[1]].add(g[0]);                                        // Time Complexity :- O(n*n*2^n);
                                                                         // Space Complexity :- O(n*n*2^n);
        }
        return f(grap,arr,0,-1,0,new Long[N][N+2][1<<N]);
    }
    
    long f(HashSet<Integer>[] graph,int[] a,int idx,int p_val,int visit,Long[][][] dp) {
        if(idx>=a.length) return 1;
        
        if(dp[idx][p_val+1][visit]!=null) return dp[idx][p_val+1][visit];
        long ans=0;
        for(int i=0;i<a.length;i++) 
        {
            if((visit&(1<<i))==0) 
            {
                // visit[i]=1;
                if(p_val==-1) {
                    ans+=f(graph,a,idx+1,a[i],visit+(1<<i),dp);
            } 
            else 
                {
                    if(graph[p_val].contains(a[i]))
                    {
                        ans+=f(graph,a,idx+1,a[i],visit+(1<<i),dp);
                    }
                }
                // visit[i]=0;
            }
        }
        return dp[idx][p_val+1][visit]=ans;
    }
}
