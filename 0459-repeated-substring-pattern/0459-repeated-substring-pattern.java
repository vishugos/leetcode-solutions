class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        int n =  s.length();
        int len = 0;

        int[] lps = new int[s.length()];

          int i = 1;
        while(i < s.length()){

            if(s.charAt(i) == s.charAt(len)){
              
                len++;
                lps[i] = len;
                i++;
            }
            else if(len >0){
                len = lps[len - 1];
            }
            else{
                lps[i] = 0;
                i++;
            }
        }
        
        int length = lps[s.length() - 1];

        if( length > 0 && n % (n - length) == 0){
            return true;
        }
        
        return false;
    }
}