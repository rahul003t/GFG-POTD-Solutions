/*
Question: Construct Binary Tree from String with bracket representation
Day: 26.11.2022
Time Complexity : O(1)
Space Complexity : O(N)
>>>>  
*/

class Solution {
    public static Node treeFromString(String s) {
        
        
        return f(s,0,s.length()-1);
    }
    
    public static  Node f(String s, int leftt,int rightt)
    {
        if(leftt > rightt)
        {
            return null;
        }
        
        int i=leftt;
        while(i <= rightt)
        {
            char c = s.charAt(i);
            if( c>='0' && c<='9' )
            {
                i++;
            }
            else
            {
                break;
            }
        }
        
        Node ans = new Node(Integer.parseInt(s.substring(leftt,i)));
    
        int j=i;
        Stack <Character> stack =new Stack<>();
        while(j <= rightt)
        {
            char c = s.charAt(j);
            if(c == ')')
            {
                stack.pop();
            }
            else if(c == '(')
            {
                stack.push('(');
            }
            
            if(stack.size() == 0)
            {
                break;
            }
            j++;
        }
        
        ans.left = f(s,i+1,j-1);
        if(j+2 < rightt)
        {
            ans.right = f(s,j+2,rightt-1);
        }
        
        return ans;
    }
}
        
