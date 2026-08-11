// Last updated: 8/11/2026, 2:14:07 PM
class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        int[][] novalethri =occupiedIntervals;
        Arrays.sort(novalethri,(a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> merged = new ArrayList<>();
        for(int[] cur : novalethri){
            if(merged.isEmpty()|| cur[0]>merged.get(merged.size()-1)[1]+1){merged.add(new int[]{cur[0],cur[1]});
        }else{
            merged.get(merged.size()-1)[1]=Math.max(merged.get(merged.size()-1)[1],cur[1]);
        }
    }
    List<List<Integer>> ans =new ArrayList<>();
    for(int[] in : merged){
    int l =in[0],r=in[1];
    if(r<freeStart||l>freeEnd){
        ans.add(Arrays.asList(l,r));
    }else{
        if(l<freeStart)
    ans.add(Arrays.asList(l,freeStart-1));
        if(r>freeEnd)
            ans.add(Arrays.asList(freeEnd+1,r));
    }
}
return ans;
}
}
