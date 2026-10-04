class Solution {
    public int maxDepth(String s) {

        // Given a valid parentheses string, we need to find its maximum depth.
        // Logic:
        // - If we see '(', increase depth counter (cnt++) and update max.
         // - If we see ')', decrease depth counter (cnt--).
         // - Ignore other characters.
         // Finally, return the maximum depth found.

        int max = 0;
        int cnt = 0;

        for( char  c :s.toCharArray()){

            if(c == '(') {
            cnt++;
            if(max < cnt) max = cnt;

             } else if(c == ')'){
             cnt--;
             }
                
            
        }

        return max;
        
    }
}