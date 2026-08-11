// Last updated: 8/11/2026, 2:15:06 PM
class Solution {
    public int numberOfSteps(int n) {
        int c=0;
        while(n>0) {
        if(n%2==0) {
        n=n/2;
    }else{
    n=n-1;
    }
    c++;
    }
    return c;
    }
}

