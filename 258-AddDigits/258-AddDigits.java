// Last updated: 8/11/2026, 2:16:37 PM
class Solution {
    public int addDigits(int num) {
        if(num==0) 
        return 0;
        return ((num-1)%9+1);
        
    }
}