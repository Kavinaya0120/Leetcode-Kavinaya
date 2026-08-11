// Last updated: 8/11/2026, 2:16:53 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele:nums)
        if(pq.size()<k){
            pq.add(ele);
        }else if(ele>pq.peek()){
            pq.poll();
            pq.add(ele);
        }
        return pq.peek();
    }
}