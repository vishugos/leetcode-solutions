class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        
        int left = 0;
        int ones = 0;

        String best = "";

        for(int right = 0; right < s.length(); right++){

            // current char ki length

            if(s.charAt(right) == '1'){
             
             ones++;

            }

            while(ones == k){

               String current = s.substring(left , right + 1);

               // pehla valid index 

               if(best.equals("")){
                 best = current;
               }

               //short substring mil gyi
               else if(current.length() < best.length()){
                best = current;
               }

               // same length ki substring mil gyi but lexicographically different 

               else if(current.length() == best.length() 
               && current.compareTo(best) < 0){

                best = current;
               }

               if(s.charAt(left) == '1'){
                ones--;
               }

               left++;
            }
          
        }
        return best;
    }
}