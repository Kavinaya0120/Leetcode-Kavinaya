// Last updated: 8/11/2026, 2:13:39 PM
class Solution {
    public int maxDistance(String moves) {
        int maxDist =0;
        char[] options={'U','D','L','R'};
        for(char opt:options){
            int x=0,y =0;
            for(int i=0;i<moves.length();i++){
                
              char c = moves.charAt(i);
                char actual =(c=='_')?opt:c;
                if(actual=='U')y++;
                else if(actual=='D')y--;
                else if(actual=='L') x--;
                else if(actual=='R') x++;
            }
            maxDist=Math.max(maxDist,Math.abs(x)+Math.abs(y));
        }
        return maxDist;
    }
}