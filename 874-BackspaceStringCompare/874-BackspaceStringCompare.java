// Last updated: 8/11/2026, 2:15:38 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        Stack<Character> tst = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch=='#'){
                if(!st.isEmpty())
                   st.pop();
            }else {
                st.push(ch);
            }
        }
        for(char ch: t.toCharArray()){
            if(ch=='#'){
                if(!tst.isEmpty())
                   tst.pop();
            }else {
                tst.push(ch);
            }
        }
         return st.equals(tst);
    }
}