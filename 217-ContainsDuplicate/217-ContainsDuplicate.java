// Last updated: 8/11/2026, 2:16:49 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s =new HashSet<>();
        for(int ele:nums)
        s.add(ele);
        return s.size()!=nums.length;
    }
}