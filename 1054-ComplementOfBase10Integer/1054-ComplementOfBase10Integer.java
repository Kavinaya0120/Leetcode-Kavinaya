// Last updated: 8/11/2026, 2:15:21 PM
class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int mask=0;
        int temp = n;
        while(temp > 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }
        return n^mask;
    }
    
}