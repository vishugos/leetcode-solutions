class Solution {
    public int maxRepOpt1(String text) {

        int n = text.length();

        int total [] = new int[26];

        // ab ahar  char ki freq count krunga 

        for(int i = 0; i < text.length(); i++){

            total[text.charAt(i) - 'a']++;
        }

        int i = 0;
        int ans = 0;

        while(i < n){

            char ch = text.charAt(i);

            int j = i;

            //pehle consicutive group ki length 
           while(j < n && text.charAt(j) == ch ){

            j++;
           }
           
           int leftCount = j - i;

           // ek diff char ke baad same grup try kro

           int k = j + 1;

           while(k  < n  && text.charAt(k) == ch){
            k++;
           }

           int rightCount = k - (j + 1);


            // Dono groups ko combine karne ki possibility
            int combined = leftCount + rightCount;

            // Total frequency se zyada characters nahi ho sakte
            ans = Math.max(ans, Math.min(combined + 1, total[ch - 'a']));

            // Single group ko bhi consider karo
            ans = Math.max(ans, Math.min(leftCount + 1, total[ch - 'a']));

            i = j;
        }

        return ans;
    }
}