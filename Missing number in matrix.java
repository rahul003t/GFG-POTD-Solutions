
// Date : 25.12.2022
// problem statement: Missing number in matrix( Easy Level )
// Time complexity : O(N^2)
// Space complexity : O(1)





class Solution
{
    public long  MissingNo(int[][] matrix)
    {
        int n = matrix.length;
        int idx=-1,jdx=-1;
        long expected_sum=-1,required_sum=-1,sum=0;
        for(int i=0;i<n;i++) {
            boolean isChanged = false;
            sum=0;
            for(int j=0;j<n;j++) {
                if(matrix[i][j]==0) {
                    idx=i;
                    jdx=j;
                    isChanged=true;                                     // Time complexity: O(N^2)
                                                                        // Space Complexity: O(1)
                }
                sum+=matrix[i][j];
            }
            if(isChanged) {
                required_sum=sum;
            } else {
                expected_sum=sum;
            } 
            if( idx != -1  &&  jdx != -1 &&  required_sum != -1  &&  expected_sum != -1)  break;
        }
        
        long ans= expected_sum-required_sum;
        if(ans<=0) return -1;
        
        long d1=0,d2=0,row_sum=0,col_sum=0,val1=0,val2=0;
        for(int i=0;i<n;i++) {
            row_sum=0;
            col_sum=0;
            for(int j=0;j<n;j++) {
                val1=matrix[i][j];
                val2=matrix[j][i];
                if(j==idx && i==jdx) val2=ans;
                if(i==idx && j==jdx) val1=ans;
                row_sum+=val1;
                col_sum+=val2;
                if(i==j) d1+=val1;
                if(i==n-j-1) d2+=val1;
            }
            if(row_sum!=expected_sum || col_sum!=expected_sum) return -1;
        }
        
        if(d1!=expected_sum || d2!=expected_sum) return -1;
        
        return ans;
    }
}
