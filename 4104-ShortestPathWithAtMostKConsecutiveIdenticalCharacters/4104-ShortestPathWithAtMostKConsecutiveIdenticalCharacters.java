// Last updated: 8/11/2026, 2:13:59 PM
class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        List<int[]>[]adj = new List[n];
        for(int i=0;i<n;i++) adj[i]= new ArrayList<>();
        for(int[] e: edges) adj[e[0]].add(new int[]{e[1], e[2]});

        long[][] dist = new long[n][k+1];
        Arrays.fill(dist[0],Long.MAX_VALUE);
        for(long[] row:dist) Arrays.fill(row,Long.MAX_VALUE);
        dist[0][1] =0;
        PriorityQueue<long[]> pq =new PriorityQueue<>((a,b)-> Long.compare(a[0],b[0]));
        pq.offer(new long[]{0,0,1});
        while(!pq.isEmpty()){
            long[] cur = pq.poll();
            long cost = cur[0]; int u=(int) cur[1],streak =(int) cur[2];
            if(cost> dist[u][streak]) continue;
            if(u==n-1) return (int) cost;

            for(int[] e:adj[u]){
                int v =e[0],w=e[1];
                int ns = (labels.charAt(v)==labels.charAt(u)) ? streak+1:1;
                if(ns>k) continue;
                if(cost+w<dist[v][ns]) {
                    dist[v][ns] = cost+w;
                    pq.offer(new long[]{cost +w,v,ns});
                }
            }
        }
        long best = Long.MAX_VALUE;
        for(int s=1;s<=k;s++) best =Math.min(best,dist[n-1][s]);
        return best == Long.MAX_VALUE ?-1:(int) best;
    }
}