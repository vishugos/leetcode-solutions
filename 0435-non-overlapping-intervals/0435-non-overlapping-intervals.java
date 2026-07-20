class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        if(intervals.length == 0) return 0;

        Arrays.sort(intervals,(a,b) -> Integer.compare(a[1] , b[1]));

         int cnt = 0;
         int end = intervals[0][1];
        for(int i = 1 ; i < intervals.length; i++){
               
               // if no overlap
            if(end <= intervals[i][0]){

                end = intervals[i][1];

            } else{
                cnt++;
            }
        }

        return cnt;
        
    }
}