class Solution {
    public int findLongestChain(int[][] pairs) {

        if(pairs.length == 0) return 0;


        Arrays.sort(pairs , (a,b) -> Integer.compare(a[1], b[1]));

        int cnt = 1;
        int end = pairs[0][1];
        
        for(int i = 1; i < pairs.length; i++){

            if(end < pairs[i][0]){
                  
                  cnt++;
                  end = pairs[i][1];

            }

        }

        return cnt;
        
    }
}