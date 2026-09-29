class Solution {
    public int beautySum(String s) {
        
        int ans = 0;

        for(int start = 0; start < s.length(); start++){
           int [] freq = new int[26];

           for(int end = start; end < s.length(); end++){

             freq[s.charAt(end) - 'a' ]++;

             int max = 0;
             int min = Integer.MAX_VALUE;

             for(int i = 0; i < 26 ; i++){

                if(freq[i] > 0){

                    max = Math.max(max , freq[i]);

                    min = Math.min(min , freq[i]);
                }
             }
             ans += max - min;
           }
        }
        return ans;
    }
}