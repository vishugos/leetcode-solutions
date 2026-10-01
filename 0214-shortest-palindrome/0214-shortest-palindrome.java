class Solution {
    public String shortestPalindrome(String s) {

        String rev = new StringBuilder(s).reverse().toString();

        String combine = s+ "#" +rev;

        int [] lps = new int[combine.length()];

        int i = 1;
        int len = 0;

        while(i < combine.length()){
       
            if(combine.charAt(i) == combine.charAt(len) ){

                 len++;
                 lps[i] = len;
                 i++;
            }else if(len > 0){
                 len = lps[len - 1];
            }
 
           else{
            lps[i] = 0;
            i++;
           }
        }

        int longest = lps[combine.length() - 1];

        String suffix = s.substring(longest);

        return new StringBuilder(suffix).reverse().append(s).toString();
    }
}