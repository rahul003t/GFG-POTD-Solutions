// Date : 02.01.2023
// problem statement: Maximum Value(Mid Level)
// Time complexity : O(N)
// Space complexity : O(N)


class Solution {
    ArrayList<Integer> maximumValue(Node node) {
       //code here
       
       // using a queue datastrucutre
       ArrayDeque<Node> dq = new ArrayDeque<>();
       //adding elements
       dq.add(node);
       //creating a arraylist for storing the elements and return it
       ArrayList <Integer> list = new ArrayList<>();
       
       while(dq.size() > 0)
       {
           int n = dq.size();
           int max = 0;
           //decrementing the queue till 0
           while(n --> 0)
           {
               //head node
               Node p = dq.pop();
               max = Math.max(max,p.data);
               //for the left part of the tree
               if(p.left != null)
               {
                   dq.add(p.left);
               }
               //for the right part
               if(p.right != null)
               {
                   dq.add(p.right);
               }
               
             
           }
            list.add(max);
           
       }
       return list;
    }
}
