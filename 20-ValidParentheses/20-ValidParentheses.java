// Last updated: 8/11/2026, 2:18:32 PM
class Solution {
    boolean isMatchingPair(char c,char top){
        if((c==']' && top=='[')|| (c=='}' && top=='{') || (c==')' && top=='('))
        return true;
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='[' || c=='{' || c=='(')
            st.push(c);
            else{
                if(st.isEmpty()) return false;
                char top =st.pop();
                if(!isMatchingPair(c,top))
                return false;
            }
        }
        if(st.isEmpty())
        return true;
        else
        return false;
    }
}