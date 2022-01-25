class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1,o2)->o1[0]-o2[0]);
        List<int[]> arr = new ArrayList<>();
        int start = intervals[0][0],end = intervals[0][1],i=1,len=intervals.length;
        int curr_start,curr_end;
        while (i < len){
            curr_start = intervals[i][0];
            curr_end = intervals[i][1];
            if (curr_start <= end){
                end = Math.max(curr_end,end);
            }
            else{
                arr.add(new int[]{start,end});
                start = curr_start;
                end = curr_end;
            }
            i++;
        }
        arr.add(new int[]{start,end});
        return arr.toArray(new int[0][]);
        
        
        
    }
}
