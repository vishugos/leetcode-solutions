class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
 
     List<String > ans = new ArrayList<>();

     for(String word : words){ 

        Map<Character , Character > map = new HashMap<>();

        Map<Character , Character > reverse = new HashMap<>();

        boolean match = true;

     for(int i = 0; i < pattern.length(); i++){

         char p = pattern.charAt(i);

         char  w = word.charAt(i);

         if(map.containsKey(p)){
            if(!map.get(p).equals(w)){
                match = false;
                break;
            }
         }

         if(reverse.containsKey(w)){
            if(!reverse.get(w).equals(p)){
                match = false;
                break;
            }
        }

        map.put(p, w);
        reverse.put(w , p);
     
          
     }
     if(match){
         ans.add(word);
     }

     }
     return ans;
        
    }
}