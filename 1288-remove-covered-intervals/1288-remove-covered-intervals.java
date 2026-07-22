class Solution {
    public int removeCoveredIntervals(int[][] intervals) {

        // Sort by start ascending.
        // If starts are same, sort by end descending.
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        int covered = 0;
        int maxEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            // Current interval is covered
            if (intervals[i][1] <= maxEnd) {
                covered++;
            } 
            // Current interval is not covered
            else {
                maxEnd = intervals[i][1];
            }
        }

        return intervals.length - covered;
    }
}