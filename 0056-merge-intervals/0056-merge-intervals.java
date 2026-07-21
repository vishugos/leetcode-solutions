class Solution {
    public int[][] merge(int[][] intervals) {

        List<int [] > ans = new ArrayList<>();


        Arrays.sort(intervals , (a , b) -> Integer.compare(a[0] , b[0]));
             

             ans.add(intervals[0]);

        for(int i = 1; i < intervals.length; i++){

           int [] last = ans.get(ans.size() - 1);

           //overlap

           if(intervals[i][0] <= last[1]) {
            
            last[1] = Math.max(intervals[i][1] , last[1]);

           }else{
                  
                  // no overlap
                  ans.add(intervals[i]);
           }
        }

        return ans.toArray(new int [ans.size()][]);
        
    }
}