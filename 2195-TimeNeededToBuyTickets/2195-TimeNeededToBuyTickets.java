// Last updated: 8/11/2026, 2:14:46 PM
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<tickets.length;i++)
            q.add(i);
            int t=0;
            while(!q.isEmpty()){
                int ind =q.poll();//comes out of the queue
                t++;//he need 1sec to buy
                tickets[ind]--;//decrement needed tickets
                if(tickets[ind]>0)
                q.add(ind);
                if(ind==k && tickets[ind]==0)
                return t;
            }
            return t;
        }
}