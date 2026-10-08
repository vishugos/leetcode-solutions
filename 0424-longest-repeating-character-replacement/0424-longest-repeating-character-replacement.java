class Solution {
    public int characterReplacement(String s, int k) {

        int [] count = new int[26];
        
        int left = 0;
        int maxFreq = 0;

        int ans = 0;

        for(int right = 0; right < s.length() ; right++){

            //curr char ka count badhao

            int index = s.charAt(right) - 'A';

            count[index]++;

            //window m max freq

            maxFreq = Math.max(maxFreq , count[index]);

            // require replacements

            int windowLength = right - left + 1;

            int replacement = windowLength - maxFreq;

            //agar replacements k zyada hai to left ko shrik kro

            if(replacement > k ){
             
             int leftIndex = s.charAt(left) - 'A';

             count[leftIndex]--;

             left++;

            }

            //valid window ka max length

            ans = Math.max(ans  , right - left + 1);
        }

        return ans;
    }
}