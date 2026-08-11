// Last updated: 8/11/2026, 2:18:01 PM
class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> st = new Stack<>();
        for(String ele: arr) {
            if(ele.equals("") || ele.equals("."))
            continue;
            else if(ele.equals("..")){
             if(!st.isEmpty())
                st.pop();
            }
            else 
            st.push(ele);
        }
        if(st.isEmpty())
        return "/";
        StringBuilder sb = new StringBuilder();
        for(String ele:st){
            sb.append("/");
            sb.append(ele);
        }
        return sb.toString();
    }
}