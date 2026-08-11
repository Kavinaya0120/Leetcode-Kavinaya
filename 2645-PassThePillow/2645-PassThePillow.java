// Last updated: 8/11/2026, 2:14:27 PM
class Solution {
    public int passThePillow(int n, int t) {
        int cycle=t/(n-1);
        int rs = t%(n-1);
        if(cycle%2==0)
        return rs+1;
    else
    return n-rs;
    }
}