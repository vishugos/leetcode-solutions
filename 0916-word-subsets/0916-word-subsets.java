class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {

        List<String> li = new ArrayList<>();

        int required [] = new int [26];

        // ab hume words2 pe traverse karna hai aur harr element ki max freq nikalni hai

        for(int i = 0; i < words2.length; i++){

            int freq[] = new int [26];

            String word = words2[i];

            for(int j = 0; j < word.length(); j++){

                char ch = word.charAt(j);

                freq[ch - 'a']++;
            }

             // ab mujhe required freq nikalni hai
            for(int r = 0 ; r < 26 ; r++){

                required[r] = Math.max(required[r] , freq[r]);
            }
        }

        for(int i = 0; i < words1.length; i++ ){

           int freq [] = new int [26];

            String word = words1[i];

            // check the frequency 
            for(int j = 0; j < word.length(); j++){
                
                char ch = word.charAt(j);
                freq[ch - 'a']++;
            }
            //issme  m freq check krunga word ki 

            boolean universal = true; 
            
            for(int f = 0 ; f < 26 ; f++){
              
              if(freq[f]  < required[f]){

                universal = false;
                break;
              }
               
            }
            if(universal){
                li.add(word);
            }
    
        }
        return li;
    }
}