// Last updated: 8/11/2026, 2:13:44 PM
class Solution {
    public String[] createGrid(int m, int n) {
        String[]grid = new String[m];
        grid[0]=".".repeat(n);
        for(int i=1;i<m;i++){
            grid[i]="#".repeat(n-1)+".";
        }
        return grid;
    }
}