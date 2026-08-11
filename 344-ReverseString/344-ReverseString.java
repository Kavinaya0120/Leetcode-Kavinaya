// Last updated: 8/11/2026, 2:16:14 PM
class Solution {
    public void reverseString(char[] s) {
        int S=0,E=s.length-1;
        while(S<E) {
            char temp=s[S];
            s[S] = s[E];
            s[E] = temp;
            S++;
            E--;
        }
        for(int i=0;i<s.length-1;i++)
        System.out.println(s[i]+" ");
    }
}