class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> ans = new ArrayList<>();
        boolean inserted = false;

        for (int i = 0; i < intervals.length; i++) {

            // Case 1: Current interval newInterval se pehle hai
            if (intervals[i][1] < newInterval[0]) {
                ans.add(intervals[i]);
            }

            // Case 2: Current interval newInterval ke baad hai
            else if (intervals[i][0] > newInterval[1]) {

                if (!inserted) {
                    ans.add(newInterval);
                    inserted = true;
                }

                ans.add(intervals[i]);
            }

            // Case 3: Overlap
            else {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }

        // Agar newInterval abhi tak add nahi hua
        if (!inserted) {
            ans.add(newInterval);
        }

        return ans.toArray(new int[ans.size()][]);
    }
}