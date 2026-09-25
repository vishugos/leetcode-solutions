class Solution {
    public int longestSubstring(String s, int k) {

        return solve(s , k);
        
    }

       public static int solve(String s , int k ){
        int freq[] = new int [26];

        if(s.length() == 0){
            return 0;
        }

         for(int i = 0; i < s.length(); i++){

            freq[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s.length(); i++){

            // we have to find the invalid character 
            if(freq[s.charAt(i) - 'a'] < k){

                String left = s.substring(0 , i);

                String right = s.substring( i + 1);

                 return Math.max(solve(left , k) , solve(right , k));
            }
        }

        return s.length();
       }
}