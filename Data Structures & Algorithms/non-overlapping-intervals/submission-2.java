class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
                return a[1] - b[1];
        });
        int count = 0;
        int prevEndTime = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            int startTime = intervals[i][0];
            int endTime = intervals[i][1];
            if(startTime < prevEndTime){
                count++;
            }
            else{
                prevEndTime = Math.max(prevEndTime, endTime);
            }
        }
        return count;
    }
}
