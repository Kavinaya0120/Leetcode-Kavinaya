// Last updated: 8/11/2026, 2:15:17 PM
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(!st.isEmpty()&&st.peek()==c){
                st.pop();
            }else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ele:st){
            sb.append(ele);
        }
        return sb.toString();
    }
}