// Last updated: 8/11/2026, 2:14:01 PM
class Solution {
    public long finishTime(int n, int[][] edges, int[] baseTime) {
        List<List<Integer>> g = new ArrayList<>();
        for(int i =0;i<n;i++) g.add(new ArrayList<>());
        for(int[] e:edges) g.get(e[0]).add(e[1]);
        return dfs(0,g,baseTime);
    }
    private long dfs(int u,List<List<Integer>> g,int[] base) {
        if(g.get(u).isEmpty()) return base[u];
        long min =Long.MAX_VALUE,max=Long.MIN_VALUE;
        for(int v:g.get(u)){
            long f = dfs(v,g,base);
            min=Math.min(min,f);
            max=Math.max(max,f);
        }
        long unDuration = (max-min)+base[u];
        return max+unDuration;
    }
}